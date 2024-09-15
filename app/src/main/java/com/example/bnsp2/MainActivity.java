package com.example.bnsp2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{
    // Deklarasi variabel untuk ImageView
    ImageView imageView_satu, imageView_dua, imageView_tiga, imageView_empat, imageView_lima, imageView_enam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Menghubungkan layout activity_main dengan activity ini

        setInisialisasi();  // Memanggil method untuk inisialisasi elemen UI
        onClickMantab();  // Memanggil method untuk mengatur aksi klik pada tiap ImageView
    }

    // Method untuk mengatur aksi klik pada tiap ImageView
    private void onClickMantab(){
        // Menambahkan listener untuk imageView_satu
        imageView_satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent untuk berpindah ke activity inputActivity dan mengirim data nama_icon
                Intent d = new Intent(MainActivity.this, inputActivity.class);
                d.putExtra("nama_icon", "satu");  // Mengirim data berupa string "satu"
                startActivity(d);  // Memulai activity inputActivity
            }
        });

        // Menambahkan listener untuk imageView_dua
        imageView_dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this, inputActivity.class);
                d.putExtra("nama_icon", "dua");  // Mengirim data berupa string "dua"
                startActivity(d);  // Memulai activity inputActivity
            }
        });

        // Menambahkan listener untuk imageView_tiga
        imageView_tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this, inputActivity.class);
                d.putExtra("nama_icon", "tiga");  // Mengirim data berupa string "tiga"
                startActivity(d);  // Memulai activity inputActivity
            }
        });

        // Menambahkan listener untuk imageView_empat
        imageView_empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this, inputActivity.class);
                d.putExtra("nama_icon", "empat");  // Mengirim data berupa string "empat"
                startActivity(d);  // Memulai activity inputActivity
            }
        });

        // Menambahkan listener untuk imageView_lima
        imageView_lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this, inputActivity.class);
                d.putExtra("nama_icon", "lima");  // Mengirim data berupa string "lima"
                startActivity(d);  // Memulai activity inputActivity
            }
        });

        // Menambahkan listener untuk imageView_enam
        imageView_enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this, inputActivity.class);
                d.putExtra("nama_icon", "enam");  // Mengirim data berupa string "enam"
                startActivity(d);  // Memulai activity inputActivity
            }
        });
    }

    // Method untuk inisialisasi elemen-elemen UI (ImageView)
    private void setInisialisasi(){
        // Menghubungkan variabel dengan komponen layout berdasarkan ID masing-masing ImageView
        imageView_satu = (ImageView)findViewById(R.id.imageView_satu);
        imageView_dua = (ImageView)findViewById(R.id.imageView_dua);
        imageView_tiga = (ImageView)findViewById(R.id.imageView_tiga);
        imageView_empat = (ImageView)findViewById(R.id.imageView_empat);
        imageView_lima = (ImageView)findViewById(R.id.imageView_lima);
        imageView_enam = (ImageView)findViewById(R.id.imageView_enam);
    }
}
