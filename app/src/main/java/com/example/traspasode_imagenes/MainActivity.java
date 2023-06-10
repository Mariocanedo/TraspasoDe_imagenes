package com.example.traspasode_imagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
  ImageView imagen1;
    ImageView imagen2;
    ImageView imagen3;
    ImageView imagen4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen1=(ImageView) findViewById(R.id.imageView2);
        imagen2=(ImageView) findViewById(R.id.imageView3);
        imagen3=(ImageView) findViewById(R.id.imageView4);
        imagen4=(ImageView) findViewById(R.id.imageView5);


        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar2(""+R.drawable.tel1,""+R.color.blanco);
            }
        });
        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar2(""+R.drawable.tel2,""+R.color.azul);
            }
        });
        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar2(""+R.drawable.tel3,""+R.color.rojo);
            }
        });


        imagen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar2(""+R.drawable.tel4,""+R.color.verde);
            }
        });


    }

    protected  void llamar2(String image, String color){

        Intent intento = new Intent(MainActivity.this, MainActivity2.class) ;
        intento.putExtra("imagen",image);
        intento.putExtra("color",color);
        startActivity(intento);
    }

}
