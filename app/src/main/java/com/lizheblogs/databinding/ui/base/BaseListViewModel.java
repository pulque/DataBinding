package com.lizheblogs.databinding.ui.base;

import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;

public abstract class BaseListViewModel<T> extends ViewModel {
    // TODO: Implement the ViewModel
    private BaseAdapter adapter;
    private ArrayList<T> arrayList;

    public BaseListViewModel() {
        arrayList = new ArrayList<>();
    }

    public void setAdapter(BaseAdapter adapter) {
        this.adapter = adapter;
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void updateData(ArrayList<T> dataNew) {
        arrayList.clear();
        arrayList.addAll(dataNew);
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
