package com.codingwithmitch.googlemaps2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Project2 extends AppCompatActivity {

    private TextView dui1,dui2, dui3, dui4, dui5, dui6, dui7, dui8, dui9, dui10;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project2);

        dui1 = findViewById(R.id.dui1);
        dui2 = findViewById(R.id.dui2);
        dui3 = findViewById(R.id.dui3);
        dui4 = findViewById(R.id.dui4);
        dui5 = findViewById(R.id.dui5);
        dui6 = findViewById(R.id.dui6);
        dui7 = findViewById(R.id.dui7);
        dui8 = findViewById(R.id.dui8);
        dui9 = findViewById(R.id.dui9);
        dui10 = findViewById(R.id.dui10);

        dui1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dui1= new Intent(Project2.this, LinearLayout.class);
                startActivity(dui1);
            }
        });
        dui2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dui2= new Intent(Project2.this, RelativeLayout.class);
                startActivity(dui2);
            }
        });
        dui3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dui3= new Intent(Project2.this, TableLayout.class);
                startActivity(dui3);
            }
        });
        dui4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dui4= new Intent(Project2.this, AbsoluteLayout.class);
                startActivity(dui4);
            }
        });
        dui5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dui5= new Intent(Project2.this,  FrameLayout.class);
                startActivity(dui5);
            }
        });
        dui6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dui6= new Intent(Project2.this, ListView.class);
                startActivity(dui6);
            }
        });
        dui7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dui7= new Intent(Project2.this, GridView_project2.class);
                startActivity(dui7);
            }
        });
        dui8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dui8= new Intent(Project2.this, Control.class);
                startActivity(dui8);
            }
        });
        dui9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dui9= new Intent(Project2.this, EventHandling.class);
                startActivity(dui9);
            }
        });
        dui10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dui10= new Intent(Project2.this, CustomComponent.class);
                startActivity(dui10);
            }
        });
    }
}
