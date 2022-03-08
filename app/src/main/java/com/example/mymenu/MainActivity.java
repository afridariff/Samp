package com.example.mymenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.licet,menu);
        return super.onCreateOptionsMenu(menu);
    }


    public void hello(MenuItem item) {
        Intent i= new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);
    }
}