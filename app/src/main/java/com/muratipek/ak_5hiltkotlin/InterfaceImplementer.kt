package com.muratipek.ak_5hiltkotlin

import javax.inject.Inject

class InterfaceImplementer
    @Inject constructor() : MyInterface {
    override fun myPrintFunction(): String {
        return "My Interface Implementer"
    }
}