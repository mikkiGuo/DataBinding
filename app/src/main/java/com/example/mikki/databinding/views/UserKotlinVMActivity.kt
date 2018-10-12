package com.example.mikki.databinding.views

import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.example.mikki.databinding.R
import com.example.mikki.databinding.databinding.ActivityUserKotlinVmBinding
import com.example.mikki.databinding.viewmodels.ViewModelKotlin

class UserKotlinVMActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:ActivityUserKotlinVmBinding
                = DataBindingUtil.setContentView(this, R.layout.activity_user_kotlin_vm)

        binding.login = ViewModelKotlin()
        binding.executePendingBindings()

    }

    @BindingAdapter("toast_msg_valid")
    fun showToast(view: View, msg: String) {
        Toast.makeText(view.context, msg, Toast.LENGTH_SHORT).show()
    }
}
