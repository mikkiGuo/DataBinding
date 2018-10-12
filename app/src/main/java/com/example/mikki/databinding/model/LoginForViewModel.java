package com.example.mikki.databinding.model;

import android.text.TextUtils;
import android.util.Patterns;

public class LoginForViewModel {
    String username, password;

    public LoginForViewModel(String username, String password) {
        this.username = username;
        this.password = password;
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

    public boolean isValid(){
        return (!TextUtils.isEmpty(getUsername())
                && !TextUtils.isEmpty(getPassword())
                && Patterns.EMAIL_ADDRESS.matcher(getUsername()).matches()
                && getPassword().length() > 6);
    }

}
