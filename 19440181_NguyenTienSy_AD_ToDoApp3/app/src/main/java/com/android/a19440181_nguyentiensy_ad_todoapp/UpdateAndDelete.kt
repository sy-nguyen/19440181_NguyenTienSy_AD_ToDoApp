package com.android.a19440181_nguyentiensy_ad_todoapp

interface UpdateAndDelete {

    fun modifyItem(itemUID: String, isDone: Boolean)
    fun onItemDelete(itemUID: String)
}