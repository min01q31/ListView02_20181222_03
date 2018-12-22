package com.iu.listview02_20181222_03.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import com.iu.listview02_20181222_03.R;
import com.iu.listview02_20181222_03.datas.Store;

import java.util.List;

public class StoreAdapter extends ArrayAdapter<Store> {

    Context mContext;
    List<Store> mList;
    LayoutInflater inf;

    public StoreAdapter (Context mContext, List<Store> mList){
        super(mContext,R.layout.store_list_item, mList);

        this.mContext = mContext;
        this.mList = mList;
        this.inf = LayoutInflater.from(mContext);
    }

    
}
