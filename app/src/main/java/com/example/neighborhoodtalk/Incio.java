package com.example.neighborhoodtalk;

public class Incio {
    package com.example.ppt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

    public class Inicio extends AppCompatActivity {

        //variable para ajustar el tiempo que se va a mostrar esta pantalla
        private final int time = 5000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_inicio);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent( Inicio.this, Menu.class);
                    startActivity(intent);
                    finish();
                }
            }, time);
        }
    }
}
