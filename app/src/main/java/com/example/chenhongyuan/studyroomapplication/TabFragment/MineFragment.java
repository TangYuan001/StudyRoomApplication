package com.example.chenhongyuan.studyroomapplication.TabFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chenhongyuan.studyroomapplication.R;
import com.example.chenhongyuan.studyroomapplication.SomeActivity.FriendActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by chenhongyuan on 15/8/8.
 */
public class MineFragment extends Fragment{
    @Bind(R.id.friend_tv)
    TextView friendTv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.friend_tv)
    public void onFriendTvClick(TextView tv){
        Intent intent = new Intent();
        intent.setClass(getActivity(), FriendActivity.class);
        startActivity(intent);
    }
}
