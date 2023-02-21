package com.muratipek.ak_5hiltkotlin

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample
@Inject constructor(private val myInterfaceImplementer: MyInterface,
                    private val gson: Gson){
    fun myFunction() : String {
        return "Working: ${myInterfaceImplementer.myPrintFunction()}"
    }
}