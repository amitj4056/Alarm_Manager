package com.example.user.alarmmanager;

import android.content.Intent;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Date;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //display the logo during 5 seconds,
        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                //set the new Content of your activity
                splash.this.setContentView(R.layout.list_alarms);
            }
        }.start();


        String localTime = "12 : 00 am";
        String[] alarmTabs = new String[6];
        for(int i=0;i<6;i++) {
            alarmTabs[i] = localTime;
        }
        ListAdapter kartikAdapter = new CustomAdapter(this, alarmTabs);
        ListView kartikListView = (ListView) findViewById(R.id.alarmList);
        kartikListView.setAdapter(kartikAdapter);

    }

    public void OnClick(View view){
        Intent intent = new Intent(this, place_to_set.class);
        startActivity(intent);
    }

}
