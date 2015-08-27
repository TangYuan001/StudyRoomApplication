package com.example.chenhongyuan.studyroomapplication.TabFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.chenhongyuan.studyroomapplication.R;
import com.example.chenhongyuan.studyroomapplication.SomeActivity.ClassRoomActivity;
import com.example.chenhongyuan.studyroomapplication.SomeAdapter.StringAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by chenhongyuan on 15/8/8.
 */
public class SearchFragment extends Fragment {
    @Bind(R.id.location_spinner)
    Spinner locationSpinner;
    @Bind(R.id.last_time_spinner)
    Spinner lastTimeSpinner;
    @Bind(R.id.class_listview)
    ListView classListView;
    StringAdapter locationAdapter;
    StringAdapter lastTimeAdapter;
    StringAdapter classAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        ButterKnife.bind(this, view);

        List<String> allBuildings = new ArrayList<String>();
        allBuildings.add("理科大楼");
        allBuildings.add("物理楼");
        allBuildings.add("图书馆");
        allBuildings.add("文史楼");
        List<String> lastTime = new ArrayList<String>();
        lastTime.add("1小时");
        lastTime.add("2小时");
        lastTime.add("4小时");
        locationAdapter = new StringAdapter(getActivity());
        locationAdapter.setContent(allBuildings);
        locationSpinner.setAdapter(locationAdapter);
        locationSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        lastTimeAdapter = new StringAdapter(getActivity());
        lastTimeAdapter.setContent(lastTime);
        lastTimeSpinner.setAdapter(lastTimeAdapter);
        lastTimeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        List<String> classResult = new ArrayList<String>();
        for (int i=0;i<5;i++)
        {
            classResult.add("理科大楼B222");
        }
        classAdapter = new StringAdapter(getActivity());
        classAdapter.setContent(classResult);
        classListView.setAdapter(classAdapter);
        classListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), ClassRoomActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
