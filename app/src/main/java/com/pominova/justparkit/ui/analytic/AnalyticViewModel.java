package com.pominova.justparkit.ui.analytic;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AnalyticViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AnalyticViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is analytic fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}