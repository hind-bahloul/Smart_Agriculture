package com.example.stagetechnicien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Serre1 extends AppCompatActivity {
private TextView txtSerreFraise,txtSerreLeg,txtSerreLem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serre_1);
        txtSerreFraise=(TextView)findViewById(R.id.txtSerreFraise);
        txtSerreLeg=(TextView)findViewById(R.id.txtSerreLeg);
        txtSerreLem=(TextView)findViewById(R.id.txtSerreLem);


        txtSerreFraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Dashboard1.class));
            }
        });
        txtSerreLeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Dashboard1.class));
            }
        });
        txtSerreLem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Dashboard1.class));
            }
        });
    }
}
