package com.example.bnsp2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class inputActivity extends AppCompatActivity {

    // Deklarasi variabel untuk elemen UI
    ImageView imageView_tebak;
    EditText editText_jawabb;
    Button button_cek;
    String jawaban;  // Menyimpan jawaban yang benar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);  // Menghubungkan layout XML activity_input dengan activity ini

        setInisialisasi();  // Memanggil method untuk menginisialisasi komponen UI
        cekIntent();  // Mengecek apakah ada data yang diterima dari Intent
        onClickJos();  // Mengatur aksi ketika tombol "Cek" diklik
    }

    // Method untuk mengatur aksi klik pada button "Cek"
    private void onClickJos(){
        button_cek.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Mengambil input dari pengguna dan mengubahnya menjadi huruf kecil
                String userInput = editText_jawabb.getText().toString().trim().toLowerCase();

                // Membandingkan input pengguna dengan jawaban yang benar (diubah juga menjadi huruf kecil)
                if (userInput.equals(jawaban.toLowerCase())) {
                    // Jika jawaban benar, tampilkan pesan Toast
                    Toast.makeText(inputActivity.this, "Selamat Jawaban Anda Benar!", Toast.LENGTH_SHORT).show();
                } else {
                    // Jika jawaban salah, tampilkan pesan Toast
                    Toast.makeText(inputActivity.this, "Maaf Jawaban Anda Salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Method untuk mengecek apakah ada data yang diterima dari activity sebelumnya melalui Intent
    private void cekIntent(){
        Intent cek = getIntent();  // Mendapatkan Intent yang dikirim dari activity sebelumnya
        String nama_icon = cek.getStringExtra("nama_icon");  // Mengambil data string dengan key "nama_icon"

        if (nama_icon != null) {  // Jika nama_icon tidak null
            // Menentukan gambar yang akan ditampilkan berdasarkan nama_icon
            if (nama_icon.equalsIgnoreCase("satu")) {
                imageView_tebak.setImageResource(R.drawable.satu);  // Menampilkan gambar satu
                jawaban = "satu";  // Menyimpan jawaban yang benar
            } else if (nama_icon.equalsIgnoreCase("dua")) {
                imageView_tebak.setImageResource(R.drawable.dua);
                jawaban = "dua";
            } else if (nama_icon.equalsIgnoreCase("tiga")) {
                imageView_tebak.setImageResource(R.drawable.tiga);
                jawaban = "tiga";
            } else if (nama_icon.equalsIgnoreCase("empat")) {
                imageView_tebak.setImageResource(R.drawable.empat);
                jawaban = "empat";
            } else if (nama_icon.equalsIgnoreCase("lima")) {
                imageView_tebak.setImageResource(R.drawable.lima);
                jawaban = "lima";
            } else if (nama_icon.equalsIgnoreCase("enam")) {
                imageView_tebak.setImageResource(R.drawable.enam);
                jawaban = "enam";
            } else {
                // Jika nama_icon tidak dikenali, tampilkan pesan kesalahan
                Toast.makeText(this, "Icon tidak dikenali", Toast.LENGTH_SHORT).show();
            }
        } else {
            // Jika nama_icon null, tampilkan pesan kesalahan
            Toast.makeText(this, "nama_icon tidak tersedia", Toast.LENGTH_SHORT).show();
        }
    }

    // Method untuk menginisialisasi komponen UI
    private void setInisialisasi(){
        // Menghubungkan variabel dengan elemen-elemen UI pada layout
        imageView_tebak = (ImageView) findViewById(R.id.imageView_tebak);
        editText_jawabb = (EditText) findViewById(R.id.Text_jawab);
        button_cek = (Button) findViewById(R.id.buttonCek);
    }
}
