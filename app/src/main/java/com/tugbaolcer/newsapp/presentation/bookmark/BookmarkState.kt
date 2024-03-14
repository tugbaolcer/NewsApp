package com.tugbaolcer.newsapp.presentation.bookmark

import com.tugbaolcer.newsapp.domain.model.Article

data class BookmarkState (
    val articleList: List<Article> = emptyList()
)