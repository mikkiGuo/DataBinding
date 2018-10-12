package com.example.mikki.databinding.viewmodels

import android.databinding.BaseObservable
import android.databinding.Bindable
//import com.example.mikki.databinding.BR
import com.android.databinding.library.baseAdapters.BR

import com.example.mikki.databinding.model.LoginKt




class ViewModelKotlin(): BaseObservable() {

    val msg_success = "Login Success"
    val msg_fail = "login Fail"
    var loginKt : LoginKt
    //internal use for getting this
    @Bindable
    internal var toast_msg_valid:String? = null

    //initializer block same as constructor
    //initializer can write more code, like printing a value
    init {
        loginKt = LoginKt()
    }

    fun onLoginButtonClicked() = if(loginKt.isValid()) setToast_msg_valid(msg_success)
                                 else setToast_msg_valid(msg_fail)


    fun setUsernameTextChanged(un:CharSequence) {loginKt.username = un.toString()}

    fun setPasswordTextChanged(pw:CharSequence){loginKt.password = pw.toString()}

    fun getToast_msg_valid(): String? {
        return toast_msg_valid
    }

    fun setToast_msg_valid(toast_msg_valid: String) {
        this.toast_msg_valid = toast_msg_valid
        notifyPropertyChanged(BR.toast_msg_valid)
    }


}