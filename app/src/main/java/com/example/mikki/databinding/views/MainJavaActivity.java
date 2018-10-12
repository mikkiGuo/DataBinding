package com.example.mikki.databinding.views;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.mikki.databinding.R;
import com.example.mikki.databinding.databinding.ActivityMainJavaBinding;
import com.example.mikki.databinding.model.Login;

public class MainJavaActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;
    Login login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //setContentView(R.layout.activity_main_java);

        //since activity_main changed to data binding xml,
        //do the following to bind activity with xml
        ActivityMainJavaBinding activityMainJavaBinding
                = DataBindingUtil.setContentView(this, R.layout.activity_main_java);


        login = new Login("andy@gmail.com", "123");

        activityMainJavaBinding.setUserlogin(login);
        activityMainJavaBinding.setTitle("Login");

//        etUsername = findViewById(R.id.et_java_username);
//        etPassword = findViewById(R.id.et_java_password);
//        btnLogin = findViewById(R.id.btn_java_login);
//
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                etUsername.setText(user.getUsername());
//                etPassword.setText(user.getPassword());
//            }
//        });

    }
}
