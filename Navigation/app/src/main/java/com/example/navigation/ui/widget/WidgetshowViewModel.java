package com.example.navigation.ui.widget;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WidgetshowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public WidgetshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este es un fragmento con un widget");
    }
    public LiveData<String> getText() {
        return mText;
    }
}