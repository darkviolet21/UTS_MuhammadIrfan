package com.si5a.uts_muhammadirfan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tvNama, tvNopendaftaran, tvJalur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNama = findViewById(R.id.tv_nama);
        tvJalur = findViewById(R.id.tv_jalur);
        tvNopendaftaran = findViewById(R.id.tv_nopendaftaran);

        Intent intent = getIntent();
        tvNama.setText(intent.getStringExtra("Nama"));
        tvNopendaftaran.setText(intent.getStringExtra("Nomor"));
        tvJalur.setText(intent.getStringExtra("Jalur"));
    }
}
