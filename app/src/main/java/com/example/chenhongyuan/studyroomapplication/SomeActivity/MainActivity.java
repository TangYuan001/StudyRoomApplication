package com.example.chenhongyuan.studyroomapplication.SomeActivity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.chenhongyuan.studyroomapplication.R;
import com.example.chenhongyuan.studyroomapplication.TabFragment.MineFragment;
import com.example.chenhongyuan.studyroomapplication.TabFragment.RankFragment;
import com.example.chenhongyuan.studyroomapplication.TabFragment.SearchFragment;
import com.example.chenhongyuan.studyroomapplication.TabFragment.TimeFragment;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends ActionBarActivity {
    @Bind(R.id.main_time_rl)
    RelativeLayout timeRl;
    @Bind(R.id.main_search_rl)
    RelativeLayout searchRl;
    @Bind(R.id.main_rank_rl)
    RelativeLayout rankRl;
    @Bind(R.id.main_mine_rl)
    RelativeLayout mineRl;
    SearchFragment searchFragment = new SearchFragment();
    TimeFragment timeFragment = new TimeFragment();
    RankFragment rankFragment = new RankFragment();
    MineFragment mineFragment = new MineFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, searchFragment).commit();
    }
    @OnClick(R.id.main_mine_rl)
    public void ClickMine(RelativeLayout rl){
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, mineFragment).commit();
    }
    @OnClick(R.id.main_rank_rl)
    public void ClickRank(RelativeLayout rl){
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, rankFragment).commit();
    }
    @OnClick(R.id.main_time_rl)
    public void ClickTime(RelativeLayout rl){
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, timeFragment).commit();
    }
    @OnClick(R.id.main_search_rl)
    public void ClickSearch(RelativeLayout rl){
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, searchFragment).commit();
    }

}
