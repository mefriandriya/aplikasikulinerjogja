package com.example.admin.kulinerjogja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_utama extends AppCompatActivity {
    Button home;
    Button kuliner;
    Button maps;
    Button rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        home();
        kuliner();
        maps();
        rating();
    }

    private void rating() {
        rating = (Button) findViewById(R.id.btnrating);
        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu_utama.this, Rating.class));
            }
        });
    }

    private void maps() {
        maps = (Button) findViewById(R.id.btnmaps);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu_utama.this, MapsActivity.class));
            }
        });
    }

    private void kuliner() {
        kuliner = (Button) findViewById(R.id.btnkuliner);
        kuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu_utama.this, Kuliner.class));
            }
        });
    }

    private void home() {
        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu_utama.this,Home.class));
            }
        });
    }
}
