package com.tugbaolcer.newsapp.domain.usercases.appentry

import com.tugbaolcer.newsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry (private val localUserManager: LocalUserManager){

    operator fun invoke(): Flow<Boolean>{
       return localUserManager.readAppEntry()
    }
}