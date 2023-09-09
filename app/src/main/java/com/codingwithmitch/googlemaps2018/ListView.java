package com.codingwithmitch.googlemaps2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

public class ListView extends AppCompatActivity {

    String[] mobileArray = {"Android","Iphone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list_view_list, mobileArray);

        android.widget.ListView listView = (android.widget.ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }
}
