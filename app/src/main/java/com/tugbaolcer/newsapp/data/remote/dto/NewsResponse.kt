package com.tugbaolcer.newsapp.data.remote.dto

import com.tugbaolcer.newsapp.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)