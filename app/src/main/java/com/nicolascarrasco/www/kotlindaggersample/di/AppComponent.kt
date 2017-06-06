package com.nicolascarrasco.www.kotlindaggersample.di

import com.nicolascarrasco.www.kotlindaggersample.MyApp
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by Nicolas Carrasco S on 6/6/2017.
 */
@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        ActivityInjectionModule::class,
        AndroidInjectionModule::class))

interface AppComponent {
    fun inject(target: MyApp)
}
