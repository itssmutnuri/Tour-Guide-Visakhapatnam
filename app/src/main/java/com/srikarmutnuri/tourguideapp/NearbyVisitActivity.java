package com.srikarmutnuri.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NearbyVisitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.info_list);

        final ArrayList<InfoList> infoLists = new ArrayList<>();

        infoLists.add(new InfoList(R.drawable.nearby_one, R.string.nearby_one, R.string.nearby_one_desc, R.string.nearby_one_addr, R.string.nearby_one_time ));
        infoLists.add(new InfoList(R.drawable.nearby_two, R.string.nearby_two, R.string.nearby_two_desc, R.string.nearby_two_addr, R.string.nearby_two_time ));
        infoLists.add(new InfoList(R.drawable.nearby_three, R.string.nearby_three, R.string.nearby_three_desc, R.string.nearby_three_addr, R.string.nearby_three_time ));
        infoLists.add(new InfoList(R.drawable.nearby_four, R.string.nearby_four, R.string.nearby_four_desc, R.string.nearby_four_addr, R.string.nearby_four_time ));

        InfoListAdapter adapter = new InfoListAdapter(this, infoLists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
