package com.example.chenhongyuan.studyroomapplication.TabFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chenhongyuan.studyroomapplication.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by chenhongyuan on 15/8/8.
 */
public class TimeFragment extends Fragment {
    @Bind(R.id.plan_tv)
    TextView planTv;
    @Bind(R.id.else_tv)
    TextView elseTv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_time, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.plan_tv)
    public void onPlanTvClick(TextView tv){
        planTv.setBackgroundResource(R.drawable.bg_select_tv);
        elseTv.setBackgroundResource(R.drawable.bg_unselect_tv);
    }

    @OnClick(R.id.else_tv)
    public void onElseTvClick(TextView tv){
        planTv.setBackgroundResource(R.drawable.bg_unselect_tv);
        elseTv.setBackgroundResource(R.drawable.bg_select_tv);
    }
}
