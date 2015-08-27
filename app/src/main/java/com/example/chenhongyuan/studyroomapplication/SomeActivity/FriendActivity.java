package com.example.chenhongyuan.studyroomapplication.SomeActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;

import com.example.chenhongyuan.studyroomapplication.R;

import butterknife.ButterKnife;

/**
 * Created by chenhongyuan on 15/8/26.
 */
public class FriendActivity extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);
        ButterKnife.bind(this);
    }
}
