package com.example.mikki.databinding.views;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mikki.databinding.R;
import com.example.mikki.databinding.databinding.ActivityRegistrationBinding;
import com.example.mikki.databinding.viewmodels.ViewModel;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_registration);
        ActivityRegistrationBinding activityRegistrationBinding
                = DataBindingUtil.setContentView(this,
                R.layout.activity_registration);

        activityRegistrationBinding.setSignup(new ViewModel());
        activityRegistrationBinding.executePendingBindings();

    }

    //whatever parameter pass first goes first use
    @BindingAdapter({"toast_msg_valid"})
    public static void showToast(View view, String msg){
        Toast.makeText(view.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
