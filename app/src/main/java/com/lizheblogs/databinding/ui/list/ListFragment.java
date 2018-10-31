package com.lizheblogs.databinding.ui.list;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lizheblogs.databinding.BR;
import com.lizheblogs.databinding.R;
import com.lizheblogs.databinding.data.Product;
import com.lizheblogs.databinding.databinding.ListFragmentBinding;
import com.lizheblogs.databinding.ui.base.BaseAdapter;
import com.lizheblogs.databinding.ui.base.BaseListViewModel;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    private ListFragmentBinding binding;

    public static ListFragment newInstance() {
        return new ListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.list_fragment, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListViewModel mViewModel = ViewModelProviders.of(this).get(ListViewModel.class);
        mViewModel.initData();
        binding.setViewModel(mViewModel);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(getContext(), 3);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.recyclerView.setLayoutManager(linearLayoutManager);
        BaseAdapter<Product> productAdapter = new BaseAdapter<>(R.layout.list_item, BR.product, mViewModel.data.get());
        binding.recyclerView.setAdapter(productAdapter);

    }

    public void onClickCrash() {
        int i = 1 / 0;
    }

    public void onClickMain1() {
    }

}
