package com.example.stagetechnicien;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {
        private EditText edtName,edtEmail,edtPass;
        private Button btnRegister;
        private TextView textView6;
        private FirebaseAuth fAuth;
        private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edtEmail=(EditText)findViewById(R.id.edtMail);
        edtName=(EditText)findViewById(R.id.edtName);
        edtPass=(EditText)findViewById(R.id.edtPass);
        textView6=(TextView)findViewById(R.id.textView6);
        btnRegister=(Button) findViewById(R.id.btnRegister);
        fAuth=FirebaseAuth.getInstance();
        progressBar=findViewById(R.id.progressBar);
        if(fAuth.getCurrentUser()!=null)
        {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email=edtEmail.getText().toString().trim();
                String Password=edtPass.getText().toString().trim();
                if(TextUtils.isEmpty(Email))
                {
                    edtEmail.setError("Email is Required");
                    return;
                }
                if(TextUtils.isEmpty(Password))
                {
                    edtPass.setError("Password is Required");
                    return;
                }
                if (Password.length()<6)
                {
                    edtPass.setError("Password Must be >= 6 caractères");
                    return;
                }
                progressBar.setVisibility(view.VISIBLE);
                fAuth.createUserWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Register.this,"User Create",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),Dashboard1.class));
                        }
                        else
                        {
                            Toast.makeText(Register.this,"Error" +task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                           // startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        }
                    }
                });
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });
    }
}
