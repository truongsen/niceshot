package com.example.ios.niceshot.base

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by GMO-Runsystem on 7/26/18.
 * Copyright © 2018 GMO-Runsystem. All rights reserved.
 */
abstract class BaseAdapter<T>(context: Context, listItems: MutableList<T>) : RecyclerView.Adapter<BaseViewHolder<T>>() {
    var mListItems: MutableList<T> = mutableListOf()
    var mContext: Context

    init {
        mContext = context
        if (listItems != null)
            mListItems.addAll(listItems)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<T> {
        return onActualCreateHolder(parent, viewType)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<T>, position: Int) {
        holder.setData(mListItems.get(position))
    }

    override fun getItemCount(): Int {
        return mListItems.size
    }

    abstract fun onActualCreateHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<T>

    fun addItem(data: T) {
        mListItems.add(data)
        notifyItemInserted(itemCount - 1)
    }

    fun addItem(data: T, position: Int) {
        mListItems.add(position, data)
        notifyItemInserted(position)
    }

    fun addListItem(listItems: MutableList<T>) {
        var position: Int = itemCount
        mListItems.addAll(listItems)
        notifyItemRangeInserted(position, listItems.size)
    }

    fun addListItem(position: Int, listItems: MutableList<T>) {
        mListItems.addAll(position, listItems)
        notifyItemRangeInserted(position, listItems.size)
    }

    fun removeItem(position: Int) {
        mListItems.removeAt(position)
        notifyDataSetChanged()
    }

    fun reset() {
        mListItems.clear()
        notifyDataSetChanged()
    }
}