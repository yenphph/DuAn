package com.example.ph34781_phamhoangyen_nhom2.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ph34781_phamhoangyen_nhom2.R;
import com.example.ph34781_phamhoangyen_nhom2.model.Ten;

import java.util.ArrayList;

public class Tenadapter extends BaseAdapter {
    private final Context context;
    private final ArrayList<Ten> list;

    public Tenadapter(Context context, ArrayList<Ten> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.spinner,parent, false);
        TextView txtten = convertView.findViewById(R.id.txtten);
        txtten.setText(list.get(position).getTen());
        return convertView;
    }
}
