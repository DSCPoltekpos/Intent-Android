package com.sumadireja.intentexplicit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etData1;
        Button btnmove;

        etData1 = (EditText)findViewById(R.id.etData1);
        btnmove = (Button)findViewById(R.id.btn_pindah);

        btnmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Hasil.class);
                i.putExtra("data1", etData1.getText().toString());
                startActivity(i);
            }
        });
    }
}
