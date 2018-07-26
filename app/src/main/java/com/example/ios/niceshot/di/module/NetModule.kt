package com.example.ios.niceshot.di.module

import android.app.Application
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by GMO-Runsystem on 7/26/18.
 * Copyright © 2018 GMO-Runsystem. All rights reserved.
 */
@Module
class NetModule(url: String) {
    var mBaseUrl: String? = null

    init {
        mBaseUrl = url
    }

    @Provides
    @Singleton
    fun providesCache(application: Application): Cache {
        var cacheSize: Long = 10 * 1024 * 1024; // 10 MiB
        var cache: Cache = Cache(application.cacheDir, cacheSize)
        return cache
    }

    @Provides
    @Singleton
    fun providesOkHttpClient(cache: Cache): OkHttpClient.Builder {
        var client: OkHttpClient.Builder = OkHttpClient.Builder()
        client.cache(cache)
        return client
    }

    @Provides
    @Singleton
    fun providesRetrofit(okHttpClient: OkHttpClient) {
        var retrofit = Retrofit.Builder().baseUrl(mBaseUrl).client(okHttpClient).build()
    }
}