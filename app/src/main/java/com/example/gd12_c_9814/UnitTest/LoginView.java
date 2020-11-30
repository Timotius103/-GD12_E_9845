package com.example.gd12_c_9814.UnitTest;

import com.example.gd12_c_9814.UserDAO;

public interface LoginView {
    String getNim();
    void showNimError(String message);
    String getPassword();
    void showPasswordError(String message);
    void startMainActivity();
    void startUserProfileActivity(UserDAO user);
    void showLoginError(String message);
    void showErrorResponse(String message);
}