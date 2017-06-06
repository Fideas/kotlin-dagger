package com.nicolascarrasco.www.kotlindaggersample.di

import com.nicolascarrasco.www.kotlindaggersample.MainActivity
import com.nicolascarrasco.www.kotlindaggersample.SecondActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Nicolas Carrasco S on 6/6/2017.
 */
@Module
abstract class ActivityInjectionModule {
    @ContributesAndroidInjector
    abstract fun contributesMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributesSecondActicity(): SecondActivity
}
