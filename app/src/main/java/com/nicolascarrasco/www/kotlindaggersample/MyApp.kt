package com.nicolascarrasco.www.kotlindaggersample

import android.app.Activity
import android.app.Application
import com.nicolascarrasco.www.kotlindaggersample.di.AppComponent
import com.nicolascarrasco.www.kotlindaggersample.di.AppModule
import com.nicolascarrasco.www.kotlindaggersample.di.DaggerAppComponent

/**
 * Created by Nicolas Carrasco S on 6/6/2017.
 */
class MyApp : Application() {

    val component:AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }



    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}
