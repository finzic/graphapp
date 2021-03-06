package it.finzicontini.mojoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VeronaActivity extends AppCompatActivity {
    Button btnVeronaToVenice, btnVeronaToCavaion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verona);
        btnVeronaToVenice = findViewById(R.id.btnVeronaToVenice);
        btnVeronaToVenice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent (VeronaActivity.this, VeniceActivity.class);
                startActivity(i);
                finish();
            }
        });
        btnVeronaToCavaion = findViewById(R.id.btnVeronaToCavaion);
        btnVeronaToCavaion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent (VeronaActivity.this, CavaionActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}