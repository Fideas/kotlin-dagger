package com.nicolascarrasco.www.kotlindaggersample

import android.app.Activity
import android.app.Application

/**
 * Created by Nicolas Carrasco S on 6/6/2017.
 */
val Activity.app: MyApp
    get() = application as MyApp
