package com.codingwithmitch.googlemaps2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class GridView_project2 extends AppCompatActivity {

    private GridView_ImageAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        GridView gridView = (GridView) findViewById(R.id.list_grid_view);
        gridView.setAdapter(new GridView_ImageAdapter(this));
    }
}
