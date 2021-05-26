package com.example.boilerplate;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyModel extends ViewModel {
    private MutableLiveData<Boolean> isLogin = new MutableLiveData<>(false);
    public LiveData<Boolean> getIsLogin() {
        return isLogin;
    }

    public Boolean login() {
        isLogin.setValue(true);
        return true;
    }

    public void logout() {
        isLogin.setValue(false);
    }
}
