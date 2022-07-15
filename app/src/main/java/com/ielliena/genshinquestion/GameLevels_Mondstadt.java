package com.ielliena.genshinquestion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels_Mondstadt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels_mondstadt);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button buttonBack = (Button) findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels_Mondstadt.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonVenti = (TextView) findViewById(R.id.buttonVenti);
        buttonVenti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonBarbara = (TextView) findViewById(R.id.buttonBarbara);
        buttonBarbara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Barbara.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonDiluc = (TextView) findViewById(R.id.buttonDiluc);
        buttonDiluc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Diluc.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonLiza = (TextView) findViewById(R.id.buttonLiza);
        buttonLiza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Lisa.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonKeya = (TextView) findViewById(R.id.buttonKeya);
        buttonKeya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Kaeya.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonNoel = (TextView) findViewById(R.id.buttonNoel);
        buttonNoel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Noelle.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonJean = (TextView) findViewById(R.id.buttonJean);
        buttonJean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Jean.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonMona = (TextView) findViewById(R.id.buttonMona);
        buttonMona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Mona.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonKlee = (TextView) findViewById(R.id.buttonKlee);
        buttonKlee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Klee.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });
    }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(GameLevels_Mondstadt.this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {}
    }
}