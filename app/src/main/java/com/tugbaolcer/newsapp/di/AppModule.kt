package com.tugbaolcer.newsapp.di

import android.app.Application
import com.tugbaolcer.newsapp.data.manager.LocalUserMangerImpl
import com.tugbaolcer.newsapp.domain.manager.LocalUserManager
import com.tugbaolcer.newsapp.domain.usercases.AppEntryUseCases
import com.tugbaolcer.newsapp.domain.usercases.ReadAppEntry
import com.tugbaolcer.newsapp.domain.usercases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
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

}