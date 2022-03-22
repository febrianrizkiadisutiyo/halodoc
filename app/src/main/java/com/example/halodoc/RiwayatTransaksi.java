package com.example.halodoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RiwayatTransaksi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.riwayat_transaksi);
    }

    public void beranda(View view) {
        Intent intent = new Intent(this, Beranda.class);
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
}
