package com.srikarmutnuri.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EatingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.info_list);

        final ArrayList<InfoList> infoLists = new ArrayList<>();

        infoLists.add(new InfoList(R.drawable.eating_one, R.string.eat_one, R.string.eat_one_desc, R.string.eat_one_addr, R.string.eat_one_time ));
        infoLists.add(new InfoList(R.drawable.eating_two, R.string.eat_two, R.string.eat_two_desc, R.string.eat_two_addr, R.string.eat_two_time ));
        infoLists.add(new InfoList(R.drawable.eating_three, R.string.eat_three, R.string.eat_three_desc, R.string.eat_three_addr, R.string.eat_three_time ));
        infoLists.add(new InfoList(R.drawable.eating_four, R.string.eat_four, R.string.eat_four_desc, R.string.eat_four_addr, R.string.eat_four_time ));
        infoLists.add(new InfoList(R.drawable.eating_five, R.string.eat_five, R.string.eat_five_desc, R.string.eat_five_addr, R.string.eat_five_time ));

        InfoListAdapter adapter = new InfoListAdapter(this, infoLists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
