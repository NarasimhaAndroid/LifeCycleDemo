package com.example.narasinhareddy.lifecycledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate Invoked");


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart Invoked");


    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume Invoked");

        Intent i=new Intent(MainActivity.this,Secon.class);
        startActivity(i);


    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause Invoked");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState:");
    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop Invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
    }
}
