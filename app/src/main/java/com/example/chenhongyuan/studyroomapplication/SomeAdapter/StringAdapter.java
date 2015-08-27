package com.example.chenhongyuan.studyroomapplication.SomeAdapter;

import android.content.ClipData;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.example.chenhongyuan.studyroomapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenhongyuan on 15/8/27.
 */
public class StringAdapter extends BaseAdapter{
    private Context context;
    private List<String> dataList = new ArrayList<String>();

    public void setContent (List<String> buildingList){
        dataList = buildingList;
        notifyDataSetChanged();
    }

    public StringAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemViewHolder itemViewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_location_spinner, parent, false);
            itemViewHolder = new ItemViewHolder();
            itemViewHolder.item = (TextView)convertView.findViewById(R.id.location_item_tv);
            convertView.setTag(itemViewHolder);
        } else {
            itemViewHolder = (ItemViewHolder)convertView.getTag();
        }

        itemViewHolder.item.setText(dataList.get(position));

        return convertView;
    }

    public class ItemViewHolder{
        TextView item;
    }
}
