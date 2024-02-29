package com.tugbaolcer.newsapp.di

import android.app.Application
import com.tugbaolcer.newsapp.data.manager.LocalUserMangerImpl
import com.tugbaolcer.newsapp.data.remote.dto.AppApi
import com.tugbaolcer.newsapp.data.repository.NewsRepositoryImpl
import com.tugbaolcer.newsapp.domain.manager.LocalUserManager
import com.tugbaolcer.newsapp.domain.repository.NewsRepository
import com.tugbaolcer.newsapp.domain.usercases.appentry.AppEntryUseCases
import com.tugbaolcer.newsapp.domain.usercases.appentry.ReadAppEntry
import com.tugbaolcer.newsapp.domain.usercases.appentry.SaveAppEntry
import com.tugbaolcer.newsapp.domain.usercases.news.GetNews
import com.tugbaolcer.newsapp.domain.usercases.news.NewsUseCases
import com.tugbaolcer.newsapp.domain.usercases.news.SearchNews
import com.tugbaolcer.newsapp.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManager = LocalUserMangerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManager
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )

    @Provides
    @Singleton
    fun provideApiInstance(): AppApi {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AppApi::class.java)
    }

    @Provides
    @Singleton
    fun provideNewsRepository(
        newsApi: AppApi
    ): NewsRepository {
        return NewsRepositoryImpl(newsApi)
    }

    @Provides
    @Singleton
    fun provideNewsUseCases(
        newsRepository: NewsRepository
    ): NewsUseCases {
        return NewsUseCases(
            getNews = GetNews(newsRepository),
            searchNews = SearchNews(newsRepository)
        )
    }

}