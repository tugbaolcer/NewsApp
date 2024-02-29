package com.tugbaolcer.newsapp.data.remote.dto

import com.tugbaolcer.newsapp.util.Constants
import com.tugbaolcer.newsapp.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface AppApi {
    @GET("everything")
    suspend fun getNews(
        @Query("page") page: Int,
        @Query("sources") sources: String,
        @Query("apiKey") apiKey: String = API_KEY
    ): NewsResponse

    @GET("everything")
    suspend fun searchNews(
        @Query("q") searchQuery: String,
        @Query("sources") sources: String,
        @Query("page") page: Int,
        @Query("apiKey") apiKey: String = API_KEY
    ): NewsResponse
}