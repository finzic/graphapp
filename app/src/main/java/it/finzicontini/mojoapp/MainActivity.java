package it.finzicontini.mojoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import static java.lang.System.exit;

public class MainActivity extends AppCompatActivity {
    Switch uselessSwitch;
    Button btnToRome, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uselessSwitch = findViewById(R.id.UselessSwitch);
        uselessSwitch.setChecked(false);
        btnToRome = findViewById(R.id.btnToRome);
        btnToRome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,  RomeActivity.class);
                startActivity(i);
            }
        });
        btnExit = findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                exit(0);
            }
        });
    }
}