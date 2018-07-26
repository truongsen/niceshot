package com.example.ios.niceshot.base

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by GMO-Runsystem on 7/26/18.
 * Copyright © 2018 GMO-Runsystem. All rights reserved.
 */
abstract class BaseViewHolder<T>(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    var mData: T? = null;
    fun setData(data: T) {
        mData = data;
    }
}