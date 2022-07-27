package com.example.pertemuan04vsga;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnok = findViewById(R.id.ok);
        final Button btnTekan = findViewById(R.id.tekan);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnok.setBackgroundColor(Color.GREEN);
            }
        });

        btnTekan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Halo Selamat Pagi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}