package com.android.a19440181_nguyentiensy_ad_todoapp

class ToDoModel {
    companion object Factory{
        fun createLíst(): ToDoModel = ToDoModel()
    }
    var UID: String? = null
    var itemDataText: String? = null
    var done: Boolean? = false
}