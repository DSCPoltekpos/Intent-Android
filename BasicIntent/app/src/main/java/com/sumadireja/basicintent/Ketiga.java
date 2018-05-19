package com.sumadireja.basicintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

/**
 * Created by sumadireja on 4/9/2018.
 */

public class Ketiga extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ketiga);
    }

    public void klikBye(View v){
        Intent i = new Intent(Ketiga.this, MainActivity.class);
        startActivity(i);
    }
}
