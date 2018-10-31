package com.lizheblogs.databinding.ui.base;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

import java.util.ArrayList;

public abstract class BaseListViewModel<T> extends ViewModel {
    // TODO: Implement the ViewModel
    public final ObservableField<ArrayList<T>> data;

    public BaseListViewModel() {
        data = new ObservableField<>();
    }

    public void initData() {
        data.set(new ArrayList<T>());
    }

    public void updateData(ArrayList<T> dataNew){
        data.set(dataNew);
    }
}
