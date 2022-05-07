package it.finzicontini.mojoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CavaionActivity extends AppCompatActivity {
    Button btnBackToVerona;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cavaion);
        btnBackToVerona = findViewById(R.id.btnBackToVerona);
        btnBackToVerona.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent (CavaionActivity.this, VeronaActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

        
}