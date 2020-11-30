package com.example.gd12_c_9814.UnitTest;

import com.example.gd12_c_9814.UserDAO;

public interface LoginCallback {
    void onSuccess(boolean value, UserDAO user);
    void onError();
}