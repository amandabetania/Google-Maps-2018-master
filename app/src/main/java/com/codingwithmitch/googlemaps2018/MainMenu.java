package com.codingwithmitch.googlemaps2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.codingwithmitch.googlemaps2018.ui.LoginActivity;
import com.codingwithmitch.googlemaps2018.ui.MainActivity;

public class MainMenu extends AppCompatActivity {
    private LinearLayout project1, project2, project3, project4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        project1 = findViewById(R.id.project1);
        project2 = findViewById(R.id.project2);
        project3 = findViewById(R.id.project3);
        project4 = findViewById(R.id.project4);

        project1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent project1 = new Intent(MainMenu.this, Project1.class);
                startActivity(project1);
            }
        });
        project2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent project2 = new Intent(MainMenu.this, Project2.class);
                startActivity(project2);
            }
        });
        project3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent project3 = new Intent(MainMenu.this, LoginActivity.class);
                startActivity(project3);
            }
        });
        project4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent project4 = new Intent(MainMenu.this, Project4.class);
                startActivity(project4);
            }
        });
    }
}
