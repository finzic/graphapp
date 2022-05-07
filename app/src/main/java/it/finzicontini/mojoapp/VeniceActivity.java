package it.finzicontini.mojoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VeniceActivity extends AppCompatActivity {
    Button btnVeniceToRome, btnVeniceToVerona;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venice);
        btnVeniceToRome = findViewById(R.id.btnVeniceToRome);
        btnVeniceToRome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent (VeniceActivity.this, RomeActivity.class);
                startActivity(i);
                finish();
            }
        });
        btnVeniceToVerona = findViewById(R.id.btnVeniceToVerona);
        btnVeniceToVerona.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent (VeniceActivity.this, VeronaActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

}