package com.example.mvp;

public interface MainView {
    void showProgress();
    void hideProgress();
    void setData(String data);
    void showError(String error);
}
