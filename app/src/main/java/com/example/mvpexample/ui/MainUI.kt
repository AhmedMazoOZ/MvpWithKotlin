package com.example.mvpexample.ui

import com.example.mvpwithkotlin.model.Wisdom
import com.example.mvpwithkotlin.model.user

interface MainUI {
    fun OnUserInfoSuccess(user:user)
    fun OnWisdomfetched(wisdom: Wisdom)
}