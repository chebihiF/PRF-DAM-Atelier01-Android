package org.m2i.atelier01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("testtest","onCreate #####");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("testtest","onStart #####");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("testtest","onResume #####");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("testtest","onPause #####");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("testtest","onStop #####");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("testtest","onDestroy #####");
    }

    public void login(View view) {
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
    }
}