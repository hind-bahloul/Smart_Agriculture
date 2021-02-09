package com.example.stagetechnicien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
public class MainActivity extends AppCompatActivity {
    private ImageView button;
    private TextView txtSerre1,txtSerre2,txtSerre3,txtSerre4,txtQuitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(ImageView) findViewById(R.id.button);
        txtSerre1=(TextView) findViewById(R.id.txtSerre1);
        txtSerre2=(TextView)findViewById(R.id.txtSerre2);
        txtSerre3=(TextView)findViewById(R.id.txtSerre3);
        txtSerre4=(TextView)findViewById(R.id.txtSerre4);
        txtQuitter=(TextView)findViewById(R.id.txtQuitter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),Login.class));
                finish();
            }
        });
        txtQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),Login.class));
                finish();
            }
        });
        txtSerre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),Serre1.class));
                finish();
            }
        });
        txtSerre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),Serre2.class));
                finish();
            }
        });
        txtSerre3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),Serre3.class));
                finish();
            }

        });
        txtSerre4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),Serre4.class));
                finish();
            }

        });

    }


}
