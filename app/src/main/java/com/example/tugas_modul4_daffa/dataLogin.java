package com.example.tugas_modul4_daffa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class dataLogin extends AppCompatActivity {

    TextView dataUser, dataPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_login);

        dataUser = findViewById(R.id.dataUser);
        dataPass = findViewById(R.id.dataPass);

        Intent dataLogin = getIntent();
        String user = dataLogin.getStringExtra("user");
        String pass = dataLogin.getStringExtra("pass");
        dataUser.setText(user);
        dataPass.setText(pass);
    }
}