package com.tugbaolcer.newsapp.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.tugbaolcer.newsapp.data.remote.NewsPagingSource
import com.tugbaolcer.newsapp.data.remote.SearchNewsPagingSource
import com.tugbaolcer.newsapp.data.remote.dto.AppApi
import com.tugbaolcer.newsapp.domain.model.Article
import com.tugbaolcer.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class NewsRepositoryImpl(private val newsApi: AppApi): NewsRepository {

    override fun getNews(sources: List<String>): Flow<PagingData<Article>> {
        return Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = {
                NewsPagingSource(newsApi = newsApi, sources = sources.joinToString(separator = ","))
            }
        ).flow
    }

    override fun searchNews(searchQuery: String, sources: List<String>): Flow<PagingData<Article>> {
        return Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = {
                SearchNewsPagingSource(
                    api = newsApi,
                    searchQuery = searchQuery,
                    sources = sources.joinToString(separator = ",")
                )
            }
        ).flow
    }


}