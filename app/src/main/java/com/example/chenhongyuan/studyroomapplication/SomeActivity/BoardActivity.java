package com.example.chenhongyuan.studyroomapplication.SomeActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import com.example.chenhongyuan.studyroomapplication.R;

import butterknife.ButterKnife;

/**
 * Created by chenhongyuan on 15/8/27.
 */
public class BoardActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        ButterKnife.bind(this);
    }
}
