package com.example.m5.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.m5.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Configuration button */
    public void makeConfig(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ConfigurationActivity.class);
        startActivity(intent);

    }
}
