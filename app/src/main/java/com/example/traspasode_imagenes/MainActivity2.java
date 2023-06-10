package com.example.traspasode_imagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    Button volver;
    ImageView imagen1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intento = getIntent();
        String imagen= intento.getStringExtra("imagen");
        String color1= intento.getStringExtra("color");
        // vinculacionn con los objetos
        volver=(Button) findViewById(R.id.button);
        imagen1=(ImageView) findViewById(R.id.recibida);

        imagen1.setImageResource(Integer.parseInt(imagen));


        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atras=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(atras);
            }
        });
    }



}