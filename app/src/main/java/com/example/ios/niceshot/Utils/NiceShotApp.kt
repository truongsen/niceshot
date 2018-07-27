package com.example.ios.niceshot.Utils

import android.app.Application
import com.example.ios.niceshot.di.component.DaggerNetComponent
import com.example.ios.niceshot.di.component.NetComponent
import com.example.ios.niceshot.di.module.AppModule
import com.example.ios.niceshot.di.module.NetModule

/**
 * Created by GMO-Runsystem on 7/26/18.
 * Copyright © 2018 GMO-Runsystem. All rights reserved.
 */
class NiceShotApp : Application() {
    companion object {
        lateinit var netComponent: NetComponent
    }

    override fun onCreate() {
        super.onCreate()
        netComponent = DaggerNetComponent.builder().appModule(AppModule(this)).netModule(NetModule("")).build()
    }

    fun getNetComponent(): NetComponent? {
        return netComponent
    }
}