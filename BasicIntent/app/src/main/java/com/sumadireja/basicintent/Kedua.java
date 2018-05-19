package com.sumadireja.basicintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

/**
 * Created by sumadireja on 4/9/2018.
 */

public class Kedua extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kedua);
    }

    public void klikKembali(View view) {
        Intent i = new Intent(Kedua.this, MainActivity.class);
        startActivity(i);
    }

    public void klikLanjut(View view) {
        Intent i = new Intent(Kedua.this, Ketiga.class);
        startActivity(i);
    }
}
