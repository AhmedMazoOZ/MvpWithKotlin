package com.example.mvpexample.Presenter

import com.example.mvpexample.ui.MainUI
import com.example.mvpwithkotlin.FakeApiService
import com.example.mvpwithkotlin.FakeDatabase

class MainPresenter {
    val api= FakeApiService()
    val database= FakeDatabase()
    lateinit var view: MainUI
    fun getuserinfo(){
        val result=database.generateCurrentUser()
        view.OnUserInfoSuccess(result)
    }
    fun getwisdominfo(){
        val result=api.getrandomwisdom()
        view.OnWisdomfetched(result)
    }
}