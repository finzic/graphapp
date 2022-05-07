package it.finzicontini.mojoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MonteortoneActivity extends AppCompatActivity {
    Button btnBackToAbano; 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monteortone);
        btnBackToAbano = findViewById(R.id.btnBackToAbano);
        btnBackToAbano.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MonteortoneActivity.this, AbanoActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}