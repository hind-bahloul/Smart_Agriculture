package com.example.stagetechnicien;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ConsulterSerre3 extends AppCompatActivity {

    private DatabaseReference ref,reff;
    private TextView edtHumSol,edtHumAir,edtTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulter_serre3);
        edtHumSol=(TextView)findViewById(R.id.edtHumSol);
        edtHumAir=(TextView)findViewById(R.id.edtHumAir);
        edtTemp=(TextView)findViewById(R.id.edtTemp);
        ref = FirebaseDatabase.getInstance().getReference().child("dht11");

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String hum=snapshot.child("humidity").getValue().toString();
                String temp=snapshot.child("temperature").getValue().toString();

                edtHumAir.setText(hum);
                edtTemp.setText(temp);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reff = FirebaseDatabase.getInstance().getReference().child("Sol");

        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String humSol=snapshot.child("Humidity").getValue().toString();


                edtHumSol.setText(humSol);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}
