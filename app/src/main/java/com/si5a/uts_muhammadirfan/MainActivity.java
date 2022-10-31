package com.si5a.uts_muhammadirfan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etinputnama, etinputnomorp;
    private Spinner spjalurpendaftaran;
    private CheckBox cbkonfirmasi;
    private Button btndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etinputnama = findViewById(R.id.et_inputnama);
        etinputnomorp = findViewById(R.id.et_inputnomorpendaftaran);
        spjalurpendaftaran = findViewById(R.id.sp_jalurpendaftaran);
        cbkonfirmasi = findViewById(R.id.cb_konfirmasi);
        btndaftar = findViewById(R.id.btn_daftar);
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama, np, sp, cb;

                nama = etinputnama.getText().toString();
                np = etinputnomorp.getText().toString();
                sp = spjalurpendaftaran.getSelectedItem().toString();

                if (nama.trim().equals("")){
                    etinputnama.setError("Nama Tidak Boleh Kosong");
                }
                else if (np.trim().equals("")){
                    etinputnomorp.setError(("Nomor Pendaftaran Tidak Boleh Kosong"));
                }
                else if (sp.trim().equals("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Jalur Pendaftaran Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
                else if (!(cbkonfirmasi.isChecked())){
                    Toast.makeText(MainActivity.this, "Belum Konfirmasi Pendaftaran", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Nama", nama);
                    intent.putExtra("Nomor", np);
                    intent.putExtra("Jalur", sp);
                    startActivity(intent);
            };
        };

            });
        };
    }
