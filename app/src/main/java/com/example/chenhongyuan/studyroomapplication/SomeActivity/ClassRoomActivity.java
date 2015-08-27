package com.example.chenhongyuan.studyroomapplication.SomeActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.widget.CardView;

import com.example.chenhongyuan.studyroomapplication.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by chenhongyuan on 15/8/27.
 */
public class ClassRoomActivity extends Activity {
    @Bind(R.id.map_cdview)
    CardView mapCardView;
    @Bind(R.id.message_board_cdview)
    CardView msgBoardView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classroom);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.map_cdview)
    public void onMapClick(CardView cd){
        Intent intent = new Intent();
        intent.setClass(ClassRoomActivity.this, MapActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.message_board_cdview)
    public void onBoardClick(CardView cd){
        Intent intent = new Intent();
        intent.setClass(ClassRoomActivity.this, BoardActivity.class);
        startActivity(intent);
    }
}
