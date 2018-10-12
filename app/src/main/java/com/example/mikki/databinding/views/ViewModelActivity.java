package com.example.mikki.databinding.views;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mikki.databinding.R;
import com.example.mikki.databinding.databinding.ActivityViewModelBinding;
import com.example.mikki.databinding.viewmodels.ViewModel;

public class ViewModelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityViewModelBinding activityViewModelBinding
                = DataBindingUtil
                .setContentView(this,
                R.layout.activity_view_model);

        activityViewModelBinding.setViewmodel(new ViewModel());
        activityViewModelBinding.executePendingBindings();



    }

    //whatever parameter pass first goes first use
    @BindingAdapter({"toast_msg_valid"})
    public static void showToast(View view, String msg){
        Toast.makeText(view.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}

