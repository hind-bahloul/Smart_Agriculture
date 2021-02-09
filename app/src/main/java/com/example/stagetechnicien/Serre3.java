package com.example.stagetechnicien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Serre3 extends AppCompatActivity {

    private TextView txtPom,txtSerreTom,txtSerrePepper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serre3);
        txtPom = (TextView) findViewById(R.id.txtPom);
        txtSerreTom = (TextView) findViewById(R.id.txtSerreTom);
        txtSerrePepper = (TextView) findViewById(R.id.txtSerrePepper);


        txtPom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Dashboard3.class));
            }
        });
        txtSerreTom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Dashboard3.class));
            }
        });
        txtSerrePepper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Dashboard3.class));
            }
        });
    }
}
