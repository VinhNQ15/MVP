package com.example.mvp;

import android.os.Handler;

public class MainModelImpl implements MainModel {
    @Override
    public void loadData(final OnDataLoadedListener listener) {
        // giả lập lấy dữ liệu
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onSuccess("Dữ liệu được tải thành công!");
            }
        }, 2000);
    }
}