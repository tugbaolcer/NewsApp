package com.tugbaolcer.newsapp.domain.usercases.news

import com.tugbaolcer.newsapp.data.local.NewsDao
import com.tugbaolcer.newsapp.domain.model.Article

class DeleteArticle(
    private val newsDao: NewsDao
) {
    suspend operator fun invoke(article: Article){
        newsDao.delete(article)
    }
}