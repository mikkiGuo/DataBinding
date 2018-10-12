package com.example.mikki.databinding.views

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mikki.databinding.R
import com.example.mikki.databinding.databinding.ActivityMainBinding
import com.example.mikki.databinding.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val activityMainBinding:ActivityMainBinding
                = DataBindingUtil.setContentView(this, R.layout.activity_main);

        var user:User = User("andy@gmail.com", "123")

        activityMainBinding.user = user;


    }
}
