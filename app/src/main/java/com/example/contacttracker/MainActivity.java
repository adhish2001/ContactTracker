package com.example.contacttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button linkB, UpdateB, ReviewB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linkB = (Button) findViewById(R.id.links);
        linkB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openLinks();
            }
        });
        UpdateB = (Button) findViewById(R.id.input);
        UpdateB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openUpdate();
            }
        });
        ReviewB = (Button) findViewById(R.id.getInfo);
        ReviewB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openReview();
            }
        });
        }

    public void openReview() {
        Intent intent = new Intent(this, Review.class);
        startActivity(intent);
    }

    public void openUpdate() {
        Intent intent = new Intent(this, Update.class);
        startActivity(intent);
    }

    public void openLinks(){
            Intent intent = new Intent(this, Links.class);
            startActivity(intent);
    }
}