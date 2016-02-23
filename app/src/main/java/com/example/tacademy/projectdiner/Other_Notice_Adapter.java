package com.example.tacademy.projectdiner;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2016-02-22.
 */
public class Other_Notice_Adapter extends BaseAdapter implements Other_Notice_View.OnImageClickListener {
    List<Other_Notice_Item> items = new ArrayList<Other_Notice_Item>();

    public void add (Other_Notice_Item n) {
        items.add(n);
        notifyDataSetChanged();
    }

    public void addAll (List<Other_Notice_Item> items) {
        this.items.addAll(items);
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
        Other_Notice_View view;
        if (convertView == null) {
            view = new Other_Notice_View(parent.getContext());
            view.setOnImageClickListener(this);
        } else {
            view = (Other_Notice_View)convertView;
        }
        view.setData(items.get(position));
        return view;
    }

    public interface OnAdapterItemClickListener {
        public void onAdapterItemClickListener(Other_Notice_Adapter adapter, Other_Notice_View view, Other_Notice_Item notice, int position);
    }
    OnAdapterItemClickListener mAdapterListener;
    public void setOnAdapterItemClickListener(OnAdapterItemClickListener listener) {
        mAdapterListener = listener;
    }

    @Override
    public void onImageClick(Other_Notice_View view, Other_Notice_Item notice) {
        if (mAdapterListener != null) {
            int index = items.indexOf(notice);
            mAdapterListener.onAdapterItemClickListener(this, view, notice, index);
        }
    }

}
