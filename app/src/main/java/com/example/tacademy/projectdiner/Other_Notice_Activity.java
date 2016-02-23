package com.example.tacademy.projectdiner;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.Toast;

public class Other_Notice_Activity extends AppCompatActivity {

    ListView listView;
    Other_Notice_Adapter mAdapter;

    static final String[] Other_Notice_Menu = {"베타테스터 모집", "다이너 서비스 오픈", "업데이트 안내"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_notice);

        listView = (ListView)findViewById(R.id.other_notice_listview);
        listView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);

        mAdapter = new Other_Notice_Adapter();
        mAdapter.setOnAdapterItemClickListener(new Other_Notice_Adapter.OnAdapterItemClickListener() {
            @Override
            public void onAdapterItemClickListener(Other_Notice_Adapter adapter, Other_Notice_View view, Other_Notice_Item notice, int position) {
                Toast.makeText(Other_Notice_Activity.this, "ImageClick : " + notice.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        listView.setAdapter(mAdapter);

        initData();
    }

    private void initData() {
        for ( int i = 0 ; i < Other_Notice_Menu.length ; i ++ ) {
            Drawable d = getResources().getDrawable(R.drawable.sample_thumb_0);
            Other_Notice_Item n = new Other_Notice_Item(d, Other_Notice_Menu[i]);

            mAdapter.add(n);
        }
    }
}
