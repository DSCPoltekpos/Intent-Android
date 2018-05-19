package com.sumadireja.basicintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void klikAku(View view) {
            Intent i = (new Intent(MainActivity.this, Kedua.class));
            startActivity(i);
    }
}