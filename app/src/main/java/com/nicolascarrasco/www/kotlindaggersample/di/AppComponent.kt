package com.nicolascarrasco.www.kotlindaggersample.di

import android.app.Application
import com.nicolascarrasco.www.kotlindaggersample.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Nicolas Carrasco S on 6/6/2017.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(target: Application)
    fun inject(target: MainActivity)
}
