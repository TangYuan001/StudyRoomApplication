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
public class RankFragment extends Fragment{
    @Bind(R.id.month_tv)
    TextView monthTv;
    @Bind(R.id.week_tv)
    TextView weekTv;
    @Bind(R.id.mine_tv)
    TextView mineTv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rank, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.month_tv)
    public void onMonthTvClick(TextView tv){
        monthTv.setBackgroundResource(R.drawable.bg_select_tv);
        weekTv.setBackgroundResource(R.drawable.bg_unselect_tv);
        mineTv.setBackgroundResource(R.drawable.bg_unselect_tv);
    }

    @OnClick(R.id.week_tv)
    public void onWeekTvClick(TextView tv){
        monthTv.setBackgroundResource(R.drawable.bg_unselect_tv);
        weekTv.setBackgroundResource(R.drawable.bg_select_tv);
        mineTv.setBackgroundResource(R.drawable.bg_unselect_tv);
    }

    @OnClick(R.id.mine_tv)
    public void onMineTvClick(TextView tv){
        monthTv.setBackgroundResource(R.drawable.bg_unselect_tv);
        weekTv.setBackgroundResource(R.drawable.bg_unselect_tv);
        mineTv.setBackgroundResource(R.drawable.bg_select_tv);
    }
}
