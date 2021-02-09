package com.example.stagetechnicien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Serre2 extends AppCompatActivity {
    private TextView txtSerreTomate,txtSerreGrenade,txtSerrePepp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serre2);
        txtSerreTomate=(TextView)findViewById(R.id.txtSerreTomate);
        txtSerreGrenade=(TextView)findViewById(R.id.txtSerreGrenade);
        txtSerrePepp=(TextView)findViewById(R.id.txtSerrePepp);


        txtSerreTomate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Dashboard2.class));
            }
        });
        txtSerreGrenade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Dashboard2.class));
            }
        });
        txtSerrePepp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Dashboard2.class));
            }
        });
    }
}
