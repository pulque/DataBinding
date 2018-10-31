package com.lizheblogs.databinding.ui.main;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lizheblogs.databinding.ListActivity;
import com.lizheblogs.databinding.R;
import com.lizheblogs.databinding.databinding.MainFragmentBinding;

public class MainFragment extends Fragment {

    private MainFragmentBinding inflate;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        inflate = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false);
        return inflate.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        MainViewModel viewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        inflate.setViewmodel(viewModel);
        inflate.setFragment(this);
    }

    public void onClickCrash() {
        int i = 1 / 0;
    }

    public void onClickMain1() {
        startActivity(new Intent(getContext(), ListActivity.class));
    }

}
