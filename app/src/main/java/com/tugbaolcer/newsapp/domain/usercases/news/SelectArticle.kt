package com.tugbaolcer.newsapp.domain.usercases.news

import com.tugbaolcer.newsapp.data.local.NewsDao
import com.tugbaolcer.newsapp.domain.model.Article
import kotlinx.coroutines.flow.Flow

class SelectArticle(
    private val newsDao: NewsDao
) {
    operator fun invoke(): Flow<List<Article>> {
        return newsDao.getArticles()
    }
}