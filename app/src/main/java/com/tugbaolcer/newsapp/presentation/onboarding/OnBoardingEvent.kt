package com.tugbaolcer.newsapp.presentation.onboarding

/**
 * abstract classtir yani nesne turetilemez.
 */
sealed class OnBoardingEvent {

    object SaveAppEntry: OnBoardingEvent()
}