package com.example.mob.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class AlertHistory extends Activity implements AdapterView.OnItemClickListener {

    private static final String TAG = "click";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Resources res = getResources();
        String[] alerts = res.getStringArray(R.array.alerts);


        ListView listview = (ListView) findViewById(R.id.alertList);
        ListAdapter alertsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alerts );
        listview.setAdapter(alertsAdapter);

        listview.setOnItemClickListener(this);
    }

    public void onItemClick (AdapterView<?> l, View v, int position, long id) {
        Intent intent = new Intent();
        intent.setClass(this, ListItemDetail.class);
        intent.putExtra("position", position);
        // Or / And
        intent.putExtra("id", id);
        startActivity(intent);
    }
}

