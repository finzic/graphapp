package it.finzicontini.mojoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PadovaActivity extends AppCompatActivity {
    Button btnPadovaToVerona, btnPadovaToAbano; 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padova);

        btnPadovaToVerona = findViewById(R.id.btnPadovaToVerona);
        btnPadovaToVerona.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent (PadovaActivity.this, VeronaActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnPadovaToAbano = findViewById(R.id.btnPadovaToAbano);
        btnPadovaToAbano.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent (PadovaActivity.this, AbanoActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}