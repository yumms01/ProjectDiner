package com.example.tacademy.projectdiner.Restaurant_InfoPage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.tacademy.projectdiner.Data.RestaurantDetail_Result;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yeom on 2016-03-09.
 */
public class Detail_Restaurant_Adapter extends BaseAdapter {
    List<RestaurantDetail_Result> items = new ArrayList<RestaurantDetail_Result>();
    public void addAll(List<RestaurantDetail_Result> items) {
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    public void clearAll() {
        items.clear();
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        Detail_Restaurant_Fragment view;
//        if (convertView == null) {
//            view = new Detail_Restaurant_Fragment(parent.getContext());
//        } else {
//            view = (ItemView)convertView;
//        }
//        view.setMovieItem(items.get(position));
        return null;
    }
}
