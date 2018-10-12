package com.example.mikki.databinding.model;

import android.text.TextUtils;
import android.util.Patterns;


public class Registration {
    String username, password, email;

    public Registration(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValidate(){
        return (!TextUtils.isEmpty(getUsername())
                && !TextUtils.isEmpty(getPassword())
                && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
                && getPassword().length() > 6);
    }
}
