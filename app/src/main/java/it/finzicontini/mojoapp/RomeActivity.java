package it.finzicontini.mojoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class RomeActivity extends AppCompatActivity {
    ToggleButton goingByCar;
    Button btnToVenice, btnToVerona, btnToPadova, btnBackToMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rome);
        goingByCar = findViewById(R.id.toggleByCar);
        goingByCar.setChecked(false);
        btnToVenice=findViewById(R.id.btnToVenice);
        btnToVenice.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent (RomeActivity.this, VeniceActivity.class);
                startActivity(i);
                finish();
            }
        });
        btnToVerona=findViewById(R.id.btnVeniceToVerona);
        btnToVerona.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent (RomeActivity.this, VeronaActivity.class);
                startActivity(i);
                finish();
            }
        });
        btnToPadova=findViewById(R.id.btnToPadova);
        btnToPadova.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent (RomeActivity.this, PadovaActivity.class);
                startActivity(i);
                finish();
            }
        });
        btnBackToMain=findViewById(R.id.btnToMain);
        btnBackToMain.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent (RomeActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}