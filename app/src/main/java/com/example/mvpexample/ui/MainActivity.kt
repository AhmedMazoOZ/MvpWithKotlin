package com.example.mvpexample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvpexample.Presenter.MainPresenter
import com.example.mvpexample.databinding.ActivityMainBinding
import com.example.mvpwithkotlin.model.Wisdom
import com.example.mvpwithkotlin.model.user


class MainActivity : AppCompatActivity(), MainUI {

    lateinit var binding: ActivityMainBinding
    private val presenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Setup()
    }

    private fun Setup() {
        presenter.view = this
        presenter.getuserinfo()
        binding.fetchButton.setOnClickListener {
            presenter.getwisdominfo()
        }

    }

    override fun OnUserInfoSuccess(user: user) {
        binding.title.text = user.username

    }

    override fun OnWisdomfetched(wisdom: Wisdom) {
        binding.apply {
            dateTxt.text = wisdom.date
            wisdomTxt.text = wisdom.content
        }
    }

}