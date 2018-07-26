package com.example.ios.niceshot.Utils

import android.app.Application
import com.example.ios.niceshot.di.component.NetComponent
import dagger.internal.DaggerCollections

/**
 * Created by GMO-Runsystem on 7/26/18.
 * Copyright © 2018 GMO-Runsystem. All rights reserved.
 */
class NiceShotApp : Application() {
    private var netComponent: NetComponent? = null

    override fun onCreate() {
        super.onCreate()
    }
    fun getNetComponent(): NetComponent? {
        return netComponent
    }
}