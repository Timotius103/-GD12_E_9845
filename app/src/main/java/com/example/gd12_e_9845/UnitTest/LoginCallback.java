package com.example.gd12_e_9845.UnitTest;

import com.example.gd12_e_9845.UserDAO;

public interface LoginCallback {
    void onSuccess(boolean value, UserDAO user);
    void onError();
}