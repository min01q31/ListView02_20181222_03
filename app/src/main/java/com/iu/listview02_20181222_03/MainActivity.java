package com.iu.listview02_20181222_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.iu.listview02_20181222_03.adapters.StoreAdapter;
import com.iu.listview02_20181222_03.datas.Store;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    ListView storeListView;
    List<Store> storeList = new ArrayList<Store>();
    StoreAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        fillStores();

        mAdapter = new StoreAdapter(mContext, storeList);
        storeListView.setAdapter(mAdapter);
    }
    void fillStores() {
        storeList.clear();

        storeList.add(new Store("BBQ","종로구 10길",4,"오후2시부터 오전 1시","01012345678"));
        storeList.add(new Store("BHC","종로구 11길",4,"오후2시부터 오전 3시","01045345678"));
        storeList.add(new Store("네네치킨","종로구 12길",4,"오후6시부터 오전 11시","0101234678"));
        storeList.add(new Store("굽네치킨","종로구 1길",4,"오후2시부터 오전 3시","01012975678"));
        storeList.add(new Store("디디치킨","종로구 2길",4,"오후2시부터 오전 1시","01012745678"));
        storeList.add(new Store("노랑통닭","종로구 5길",4,"오후2시부터 오전 1시","01012390128"));
        storeList.add(new Store("교촌치킨","종로구 4길",4,"오후2시부터 오전 1시","01012975678"));
    }

    @Override
    public void bindViews() {
        storeListView = findViewById(R.id.storeListView);
    }
}
