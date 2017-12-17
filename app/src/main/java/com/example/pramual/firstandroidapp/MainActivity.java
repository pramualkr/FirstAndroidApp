package com.example.pramual.firstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.pramual.firstandroidapp.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Add Frgment to Activity



        if (savedInstanceState== null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentFragment, new MainFragment())
                    .commit();
        }
    } // Main Method
}  // main Class
