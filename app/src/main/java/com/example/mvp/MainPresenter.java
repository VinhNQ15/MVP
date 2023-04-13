package com.example.mvp;

public class MainPresenter implements MainPre<MainView> {

    private MainView view;
    private MainModel model;

    public MainPresenter(MainModel model) {
        this.model = model;
    }

    @Override
    public void attachView(MainView view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    public void loadData() {
        view.showLoading();
        model.loadData(new OnDataLoadedListener() {
            @Override
            public void onSuccess(String data) {
                view.hideLoading();
                view.showData(data);
            }

            @Override
            public void onFailure(String error) {
                view.hideLoading();
                view.showError(error);
            }
        });
    }
}
