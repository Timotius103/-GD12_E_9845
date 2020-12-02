package com.example.gd12_e_9845.UnitTest;

import com.example.gd12_e_9845.UserDAO;

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