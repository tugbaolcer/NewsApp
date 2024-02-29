package com.tugbaolcer.newsapp.domain.usercases.news

import androidx.paging.PagingData
import com.tugbaolcer.newsapp.domain.model.Article
import com.tugbaolcer.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetNews(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.getNews(sources = sources)
    }
}