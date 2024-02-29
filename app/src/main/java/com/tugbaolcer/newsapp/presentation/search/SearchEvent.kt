package com.tugbaolcer.newsapp.presentation.search

sealed class SearchEvent {

    object SearchNews : SearchEvent()

    data class UpdateSearchQuery(val searchQuery: String) : SearchEvent()

}