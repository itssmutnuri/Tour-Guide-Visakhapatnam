package com.srikarmutnuri.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class VisitingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.info_list);

        final ArrayList<InfoList> infoLists = new ArrayList<>();

        infoLists.add(new InfoList(R.drawable.places_one, R.string.place_one, R.string.place_one_desc, R.string.place_one_addr, R.string.place_one_time ));
        infoLists.add(new InfoList(R.drawable.places_two, R.string.place_two, R.string.place_two_desc, R.string.place_two_addr, R.string.place_two_time ));
        infoLists.add(new InfoList(R.drawable.places_three, R.string.place_three, R.string.place_three_desc, R.string.place_three_addr, R.string.place_three_time ));
        infoLists.add(new InfoList(R.drawable.places_four, R.string.place_four, R.string.place_four_desc, R.string.place_four_addr, R.string.place_four_time ));
        infoLists.add(new InfoList(R.drawable.places_five, R.string.place_five, R.string.place_five_desc, R.string.place_five_addr, R.string.place_five_time ));

        InfoListAdapter adapter = new InfoListAdapter(this, infoLists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
