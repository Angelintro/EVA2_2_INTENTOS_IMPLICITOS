package com.example.walmart.eva2_2_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity implements View.OnClickListener{
Button BtnIndice;
Intent inLanzarSecun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        BtnIndice = findViewById(R.id.BtnIndice);
        BtnIndice.setOnClickListener(this);
        // que ejecute la 2da pantalla
        inLanzarSecun = new Intent(this, SecondActivity.class);
    }

    @Override
    public void onClick(View v) {
        startActivity(inLanzarSecun);
    }
}
