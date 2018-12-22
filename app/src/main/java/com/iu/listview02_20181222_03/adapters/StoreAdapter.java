package com.iu.listview02_20181222_03.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    //getView메쏘드는 리스트뷰가 한줄을 그리려고 할때 호출
    //==>Ex 0번째 줄을 그리려고 하는데, 그 내용이 뭐니? 에 대한 답변을 작성
    //몇번째 줄인지는 position에 담겨서 들어오게 됨.
    //만약 100명의 회원? getView가 100번 호출=>리스트뷰는 필요한 만큼만 뷰를 생성하고,
    // 그 외의 경우는 기존의 생성한 비률 재활용하도록 코딩
    //뷰를 재활용
    //-재활용이 아닌 상황이라면 convertView가 null이 담겨오게됨
    //판단기준 : convertView가 null인지 아닌지
    //row가 null일때 inflate를 실행, inflate? xml파일을 불러다가 실제로 메모리에 올려주는 역할

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View row = convertView;
        if(row == null){
            row = inf.inflate(R.layout.store_list_item,null);
        }
        TextView storeNameTxt = row.findViewById(R.id.sotreNameTxt);
        TextView storeAddressTxt = row.findViewById(R.id.storeAddressTxt);
        Button storeCallBtn = row.findViewById(R.id.storeCallBtn);
        TextView storeOpenTimeTxt = row.findViewById(R.id.storeOpenTimeTxt);

        final Store data = mList.get(position);

        storeNameTxt.setText(data.getName());
        storeAddressTxt.setText(data.getAddress());
        storeOpenTimeTxt.setText(data.getOpenAndCloseTime());

        storeCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(mContext, data.getPhoneNum()+"에전화를 겁니다.", Toast.LENGTH_SHORT).show();

                Uri uri = Uri.parse(String.format("tel:%s",data.getPhoneNum()));

                Intent intent = new Intent(Intent.ACTION_DIAL, uri);

                mContext.startActivity(intent);
            }
        });
        return row;
    }
}
