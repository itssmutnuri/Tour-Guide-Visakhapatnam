package com.srikarmutnuri.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class StayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.info_list);

        final ArrayList<InfoList> infoLists = new ArrayList<>();

        infoLists.add(new InfoList(R.drawable.stay_one, R.string.stay_one, R.string.stay_one_desc, R.string.stay_one_addr, R.string.stay_one_time ));
        infoLists.add(new InfoList(R.drawable.stay_two, R.string.stay_two, R.string.stay_two_desc, R.string.stay_two_addr, R.string.stay_two_time ));
        infoLists.add(new InfoList(R.drawable.stay_three, R.string.stay_three, R.string.stay_three_desc, R.string.stay_three_addr, R.string.stay_three_time ));

        InfoListAdapter adapter = new InfoListAdapter(this, infoLists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }


}
