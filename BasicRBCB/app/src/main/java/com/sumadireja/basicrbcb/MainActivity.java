package com.sumadireja.basicrbcb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbNasgor, cbMie, cbNaslur, cbSate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final RadioGroup rgJK = (RadioGroup) findViewById(R.id.rg);
        Button btn = (Button) findViewById(R.id.btnSubmit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rgJK.getCheckedRadioButtonId();
                switch (id) {
                    case R.id.rbsatu:
                        Toast.makeText(MainActivity.this, "Clicked " + ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbdua:
                        Toast.makeText(MainActivity.this, "Clicked " + ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        buttonListener();
    }

    private void buttonListener(){
        cbNasgor = (CheckBox)findViewById(R.id.cbsatu);
        cbMie = (CheckBox)findViewById(R.id.cbdua);
        cbNaslur = (CheckBox)findViewById(R.id.cbtiga);
        cbSate = (CheckBox)findViewById(R.id.cbempat);

        Button btnsimpan = (Button)findViewById(R.id.btnSubmit2);

        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String status = "Nasgor check " + cbNasgor.isChecked()
                        + "\n Mie check " + cbMie.isChecked()
                        + "\n Naslur check " + cbNaslur.isChecked()
                        + "\n Sate Check " + cbSate.isChecked();

                Toast.makeText(MainActivity.this, status, Toast.LENGTH_SHORT).show();
            }
        });
    }
}