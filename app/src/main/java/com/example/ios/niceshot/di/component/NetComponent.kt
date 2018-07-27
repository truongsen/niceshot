package com.example.ios.niceshot.di.component

import com.example.ios.niceshot.base.BaseActivity
import com.example.ios.niceshot.di.module.AppModule
import com.example.ios.niceshot.di.module.NetModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by GMO-Runsystem on 7/27/18.
 * Copyright © 2018 GMO-Runsystem. All rights reserved.
 */
@Component(modules = arrayOf(AppModule::class, NetModule::class))
@Singleton
interface NetComponent {
    fun inject(activity: BaseActivity)
}