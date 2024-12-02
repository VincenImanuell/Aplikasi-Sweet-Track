package com.capstone.sweettrack.di

import android.content.Context
import com.capstone.sweettrack.data.Repository
import com.capstone.sweettrack.data.pref.UserPreference
import com.capstone.sweettrack.data.pref.dataStore
import com.capstone.sweettrack.data.remote.api.ApiConfig

object Injection {
    fun provideRepository(context: Context): Repository {
        val pref = UserPreference.getInstance(context.dataStore)
        val apiService = ApiConfig.getApiService()
        return Repository.getInstance(apiService, pref)
    }
}