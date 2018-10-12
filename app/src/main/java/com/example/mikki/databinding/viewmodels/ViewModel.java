package com.example.mikki.databinding.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;
import com.example.mikki.databinding.model.Registration;
import com.example.mikki.databinding.model.LoginForViewModel;

public class ViewModel extends BaseObservable {

    String msg_success = "Login Success";
    String msg_fail = "Login Fail";
    LoginForViewModel user;
    Registration registration;

    @Bindable
    String toast_msg_valid = null;

    public ViewModel() {
        user = new LoginForViewModel("", "");
        registration = new Registration("", "", "");
    }

    //when click button in xml, trigger this method
    public void onLoginBtnClicked(){
        if(user.isValid()){
            setToast_msg_valid(msg_success);
        }else{
            setToast_msg_valid(msg_fail);
        }
    }

    public String getToast_msg_valid() {
        return toast_msg_valid;
    }

    public void setToast_msg_valid(String toast_msg_valid) {
        this.toast_msg_valid = toast_msg_valid;
        notifyPropertyChanged(BR.toast_msg_valid);
    }

    public void setUsernameTextChange(CharSequence un){
        user.setUsername(un.toString());
    }

    public void setPasswordTextChange(CharSequence pw){
        user.setPassword(pw.toString());
    }

    public void onRegistrationBtnClicked(){
        if(registration.isValidate()){
            setToast_msg_valid(msg_success);
        }else{
            setToast_msg_valid(msg_fail);
        }
    }

    public void setRegistrationUsernameTextChanged(CharSequence un){
        registration.setUsername(un.toString());
    }

    public void setRegistrationPwTextChanged(CharSequence pw){
        registration.setPassword(pw.toString());
    }

    public void setEmailTextChanged(CharSequence email){
        registration.setEmail(email.toString());
    }

}
