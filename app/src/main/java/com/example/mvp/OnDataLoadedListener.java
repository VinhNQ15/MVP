package com.example.mvp;

public interface OnDataLoadedListener {
    void onSuccess(String data);

    void onError(String error);
}
