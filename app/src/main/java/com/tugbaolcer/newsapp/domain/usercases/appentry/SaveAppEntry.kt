package com.tugbaolcer.newsapp.domain.usercases

import com.tugbaolcer.newsapp.domain.manager.LocalUserManager

class SaveAppEntry (private val localUserManager: LocalUserManager){

    /**
     * bir nesneyi fonksiyon gibi çağırmanıza olanak tanır
     */
    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}