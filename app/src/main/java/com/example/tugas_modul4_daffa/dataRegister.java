package com.example.tugas_modul4_daffa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class dataRegister extends AppCompatActivity {

    TextView dataUser, dataPass, dataEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_register);

        dataUser = findViewById(R.id.dataUser);
        dataPass = findViewById(R.id.dataPass);
        dataEmail = findViewById(R.id.dataEmail);

        Intent dataRegister = getIntent();
        String user = dataRegister.getStringExtra("user");
        String email = dataRegister.getStringExtra("email");
        String pass = dataRegister.getStringExtra("pass");
        dataUser.setText(user);
        dataEmail.setText(email);
        dataPass.setText(pass);
    }
}