package com.example.stagetechnicien;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ControleSerre1 extends AppCompatActivity {
    private TextView edtRes,edtRes1,edtRes2;
    private DatabaseReference ref,reff,ref1;
    private ImageView  btn0,btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controle_serre1);
        btn0=(ImageView) findViewById(R.id.btn0);
        btn1=(ImageView) findViewById(R.id.btn1);
        btn2=(ImageView)findViewById(R.id.btn2);
        btn3=(ImageView)findViewById(R.id.btn3);
        btn4=(ImageView)findViewById(R.id.btn4);
        btn5=(ImageView)findViewById(R.id.btn5);
        edtRes=(TextView) findViewById(R.id.edtRes);
        edtRes1=(TextView) findViewById(R.id.edtRes1);
        edtRes2=(TextView) findViewById(R.id.edtRes2);

        //Controle
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference myRef=database.getReference("LED_STATUS_LAMPE");
                myRef.setValue(1);

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference myRef=database.getReference("LED_STATUS_LAMPE");
                myRef.setValue(0);

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference myRef=database.getReference("LED_STATUS_MOTEUR");
                myRef.setValue(1);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference myRef=database.getReference("LED_STATUS_MOTEUR");
                myRef.setValue(0);

            }
        });



        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference myRef=database.getReference("LED_STATUS_VANNES");
                myRef.setValue(1);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference myRef=database.getReference("LED_STATUS_VANNES");
                myRef.setValue(0);

            }
        });
        /*  Statut */
        ref = FirebaseDatabase.getInstance().getReference().child("LED_STATUS_LAMPE");

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                String status_lampe = snapshot.getValue().toString();

                edtRes.setText(status_lampe);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reff = FirebaseDatabase.getInstance().getReference().child("LED_STATUS_MOTEUR");

        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                String status_moteur=snapshot.getValue().toString();
                edtRes1.setText(status_moteur);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        ref1 = FirebaseDatabase.getInstance().getReference().child("LED_STATUS_VANNES");

        ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {


                String status_vanne=snapshot.getValue().toString();
                edtRes2.setText(status_vanne);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }



}
