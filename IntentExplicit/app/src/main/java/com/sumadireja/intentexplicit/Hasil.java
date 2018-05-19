package com.sumadireja.intentexplicit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;

/**
 * Created by sumadireja on 4/9/2018.
 */

public class Hasil extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceSstate){
        super.onCreate(savedInstanceSstate);
        setContentView(R.layout.hasil);

        TextView tvData1 = (TextView)findViewById(R.id.tvData1);

        Intent i = getIntent();
        String data1 = i.getExtras().getString("data1");

        tvData1.setText(data1);
    }
}
