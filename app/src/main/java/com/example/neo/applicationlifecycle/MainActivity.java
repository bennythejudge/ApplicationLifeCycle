package com.example.neo.applicationlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("onCreate", "onCreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("onPause", "Here I am!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("onResume", "Here I am!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("onStart", "Here I am!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("onStop", "Here I am!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("onDestroy", "Here I am!");

    }
}
