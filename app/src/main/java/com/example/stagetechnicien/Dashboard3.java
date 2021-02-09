package com.example.stagetechnicien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dashboard3 extends AppCompatActivity {
    private TextView txtCons,txtCont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard3);
        txtCons=(TextView)findViewById(R.id.txtCons);
        txtCont=(TextView)findViewById(R.id.txtCont);
        txtCons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ConsulterSerre3.class));
            }
        });
        txtCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ControleSerre3.class));
            }
        });
    }
}
