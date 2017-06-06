package com.nicolascarrasco.www.kotlindaggersample

import android.app.Activity
import android.app.Application
import com.nicolascarrasco.www.kotlindaggersample.di.AppComponent
import com.nicolascarrasco.www.kotlindaggersample.di.AppModule
import com.nicolascarrasco.www.kotlindaggersample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by Nicolas Carrasco S on 6/6/2017.
 */
class MyApp : Application(), HasActivityInjector {

    val component:AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }
}
