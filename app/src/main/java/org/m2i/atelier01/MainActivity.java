package org.m2i.atelier01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login_btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        login_btn = findViewById(R.id.btn_logIN);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NextActivity.class);
                startActivity(intent);
            }
        });
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


}