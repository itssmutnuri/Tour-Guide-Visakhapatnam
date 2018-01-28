package com.srikarmutnuri.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCustomOnClickListener(R.id.hotels, StayingActivity.class);
        setCustomOnClickListener(R.id.cafes, EatingActivity.class);
        setCustomOnClickListener(R.id.nearby_visits, NearbyVisitActivity.class);
        setCustomOnClickListener(R.id.visits, VisitingActivity.class);
    }

    public void setCustomOnClickListener(int resourceID, final Class className) {
        View view = findViewById(resourceID);
        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), className);
                        startActivity(intent);
                    }
                }
        );
    }
}
