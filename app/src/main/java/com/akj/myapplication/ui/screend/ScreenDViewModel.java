package com.akj.myapplication.ui.screend;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScreenDViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ScreenDViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Screen D");
    }

    public LiveData<String> getText() {
        return mText;
    }
}