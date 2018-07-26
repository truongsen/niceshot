package com.example.ios.niceshot.di.module

import android.app.Application
import com.example.ios.niceshot.Utils.NiceShotApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by GMO-Runsystem on 7/26/18.
 * Copyright © 2018 GMO-Runsystem. All rights reserved.
 */
@Module
class AppModule(application: Application) {
    var application: Application

    init {
        this.application = application
    }

    @Provides
    @Singleton
    fun providesApplication(): Application {
        return application
    }
}