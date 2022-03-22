package com.example.halodoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Beranda extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beranda);
    }

    public void riwayattransaksi(View view) {
        Intent intent = new Intent(this,RiwayatTransaksi.class);
        startActivity(intent);
    }

    public void pesan(View view) {
        Intent intent = new Intent(this,Pesan.class);
        startActivity(intent);
    }

    public void lainnya(View view) {
        Intent intent = new Intent(this,Lainnya.class);
        startActivity(intent);
    }

    public void profil(View view) {
        Intent intent = new Intent(this,Profil.class);
        startActivity(intent);
    }

    public void artikel(View view) {
        Intent intent = new Intent(this,Artikel.class);
        startActivity(intent);
    }
}
