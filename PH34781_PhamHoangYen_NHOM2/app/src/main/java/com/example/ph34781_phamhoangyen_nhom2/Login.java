package com.example.ph34781_phamhoangyen_nhom2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.example.ph34781_phamhoangyen_nhom2.adapter.Tenadapter;
import com.example.ph34781_phamhoangyen_nhom2.model.Ten;

import java.util.ArrayList;

public class Login extends AppCompatActivity {
ArrayList<Ten> list = new ArrayList<Ten>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Spinner spn = findViewById(R.id.spn);
        list.add(new Ten("Admin"));
        list.add(new Ten("Thu kho"));
        Tenadapter adapter = new Tenadapter(this,list);
        spn.setAdapter(adapter);
        Button btnlogin = findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Home.class));
            }
        });

    }
}