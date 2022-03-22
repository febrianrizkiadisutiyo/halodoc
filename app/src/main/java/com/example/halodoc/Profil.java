package com.example.halodoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Profil extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akun);
    }

    public void kembali(View view) {
        Intent intent = new Intent(this, Beranda.class);
        startActivity(intent);
    }
}
