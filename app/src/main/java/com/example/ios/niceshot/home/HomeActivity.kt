package com.example.ios.niceshot.home

import android.os.Bundle
import android.view.MenuInflater
import com.example.ios.niceshot.R
import com.example.ios.niceshot.Utils.NiceShotApp
import com.example.ios.niceshot.base.BaseActivity
import dagger.Component
import kotlinx.android.synthetic.main.activity_home.*
import okhttp3.Cache
import okhttp3.OkHttpClient
import javax.inject.Inject

/**
 * Created by GMO-Runsystem on 7/26/18.
 * Copyright © 2018 GMO-Runsystem. All rights reserved.
 */
class HomeActivity : BaseActivity() {
    var cache: Cache? = null
    var okHttpClient: OkHttpClient? = null
    override fun initView(savedInstanceState: Bundle?) {
        NiceShotApp.netComponent.inject(this)
    }

    override fun initData() {

    }

    override fun getMenuInflater(): MenuInflater {
        return super.getMenuInflater()

    }

    override fun getLayoutResId(): Int {
        return R.layout.activity_home;
    }
}