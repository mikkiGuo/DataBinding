package com.example.mikki.databinding.model

import android.text.TextUtils
import android.util.Patterns

class LoginKt(var username:String = "", var password:String = "") {

    fun isValid(): Boolean{

        return (!TextUtils.isEmpty(username)
                && !TextUtils.isEmpty(password)
                && Patterns.EMAIL_ADDRESS.matcher(username).matches()
                && password.length > 6)
    }
}