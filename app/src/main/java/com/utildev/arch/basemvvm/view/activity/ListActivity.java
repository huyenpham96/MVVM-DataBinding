package com.utildev.arch.basemvvm.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.utildev.arch.basemvvm.R;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
}