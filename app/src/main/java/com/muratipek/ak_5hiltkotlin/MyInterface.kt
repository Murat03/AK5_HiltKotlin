package com.muratipek.ak_5hiltkotlin

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

interface MyInterface {
    fun myPrintFunction() : String
}

/*
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule{

    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementer: InterfaceImplementer) : MyInterface
}
*/
@InstallIn(SingletonComponent::class)
@Module
class MyModule{
    @Singleton
    @Provides
    fun providerFunction() : MyInterface{
        return InterfaceImplementer()
    }
    @Singleton
    @Provides
    fun gSonProvider(): Gson{
        return Gson()
    }
}