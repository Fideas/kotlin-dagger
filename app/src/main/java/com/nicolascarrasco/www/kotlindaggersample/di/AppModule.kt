package com.nicolascarrasco.www.kotlindaggersample.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Nicolas Carrasco S on 6/6/2017.
 */
@Module
class AppModule(private val app: Application) {

    @Singleton
    @Provides
    fun providesApplication(): Application{
        return app
    }

    @Singleton
    @Provides
    fun providesSharedPreferences(): SharedPreferences{
        return app.getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
    }
}