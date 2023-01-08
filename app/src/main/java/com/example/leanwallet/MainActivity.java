package com.example.leanwallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViews();
        setListeners();

        CardDatabase.getInstanceOf().loadDatabase(getApplicationContext());
    }

    private void setViews(){
        addButton = findViewById(R.id.fab);
    }

    private void setListeners(){
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchActivityIntent = new Intent(MainActivity.this, AddActivity.class);
                startActivity(switchActivityIntent);
            }
        });
    }
}