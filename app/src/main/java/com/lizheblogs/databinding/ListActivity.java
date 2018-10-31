package com.lizheblogs.databinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lizheblogs.databinding.ui.list.ListFragment;


public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ListFragment.newInstance())
                    .commitNow();
        }
    }
}
