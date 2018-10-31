package com.lizheblogs.databinding.ui.base;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by LiZhe on 2018-10-31.
 * com.lizheblogs.databinding.ui.list
 */
public class BaseAdapter<T> extends RecyclerView.Adapter<BaseHolder> {
    private List<T> listData;
    private int layoutId;
    private int variableId;

    public BaseAdapter(int layoutId, int variableId, List<T> listData) {
        this.listData = listData;
        this.variableId = variableId;
        this.layoutId = layoutId;
    }

    @NonNull
    @Override
    public BaseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BaseHolder(LayoutInflater.from(parent.getContext())
                .inflate(layoutId, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BaseHolder holder, int position) {
        holder.setBinding(variableId, listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}

