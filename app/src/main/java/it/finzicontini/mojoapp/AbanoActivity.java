package it.finzicontini.mojoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AbanoActivity extends AppCompatActivity {
    Button btnAbanoToPadova, btnAbanoToMonteortone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abano);

        btnAbanoToPadova = findViewById(R.id.btnAbanoToPadova);
        btnAbanoToPadova.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent (AbanoActivity.this, PadovaActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnAbanoToMonteortone = findViewById(R.id.btnAbanoToMonteortone);
        btnAbanoToMonteortone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent (AbanoActivity.this, MonteortoneActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}