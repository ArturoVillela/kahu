package com.firebaseapp.charlieandroidblog.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context

@SuppressLint("StaticFieldLeak")
object UtilContext {

    private lateinit var context: Context

    fun initContext(c: Activity){
        context = c
    }

    fun getContext(): Context{
        return context
    }
}