package com.lizheblogs.databinding.ui.main;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;
import android.util.Log;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    public final ObservableField<String> name;

    public MainViewModel() {
        name = new ObservableField<>();
        name.set("123456");
    }

    public void onClickMessage() {
        name.set("789");
        Log.e("===============", "onClickMessage");
    }
}
