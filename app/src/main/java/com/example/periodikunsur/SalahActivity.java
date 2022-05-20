package com.example.periodikunsur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SalahActivity extends AppCompatActivity {

    TextView jawab;
    Button lanjut, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salah);
        getSupportActionBar().hide();
        Intent intent = getIntent();
        jawab = findViewById(R.id.jawaban);
        jawab.setText(intent.getSerializableExtra("jawab").toString());
        lanjut = findViewById(R.id.btnLanjut);
        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanjut = new Intent(SalahActivity.this, GameActivity.class);
                startActivity(lanjut);
            }
        });
        home = findViewById(R.id.btnHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(SalahActivity.this, GameActivity.class);
                startActivity(home);
            }
        });
    }
}