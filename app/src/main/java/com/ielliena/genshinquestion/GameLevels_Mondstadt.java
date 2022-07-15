package com.ielliena.genshinquestion;

import android.content.Intent;
import android.content.SharedPreferences;
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

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);

        TextView buttonVenti = (TextView) findViewById(R.id.buttonVenti);
        final int ventiResult = save.getInt("Venti", 0);
        buttonVenti.setText(getString(R.string.level_venti) + " " + ventiResult + "/17");
        buttonVenti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Venti.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonBarbara = (TextView) findViewById(R.id.buttonBarbara);
        final int barbaraResult = save.getInt("Barbara", 0);
        buttonBarbara.setText(getString(R.string.level_barbara) + " " + barbaraResult + "/17");
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
        final int dilucResult = save.getInt("Diluc", 0);
        buttonDiluc.setText(getString(R.string.level_diluc) + " " + dilucResult + "/17");
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
        final int lisaResult = save.getInt("Lisa", 0);
        buttonLiza.setText(getString(R.string.level_lisa) + " " + lisaResult + "/17");
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
        final int keayaResult = save.getInt("Kaeya", 0);
        buttonKeya.setText(getString(R.string.level_kaeya) + " " + keayaResult + "/17");
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
        final int noelleResult = save.getInt("Noelle", 0);
        buttonNoel.setText(getString(R.string.level_noelle) + " " + noelleResult + "/17");
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
        final int jeanResult = save.getInt("Jean", 0);
        buttonJean.setText(getString(R.string.level_jean) + " " + jeanResult + "/17");
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
        final int monaResult = save.getInt("Mona", 0);
        buttonMona.setText(getString(R.string.level_mona) + " " + monaResult + "/17");
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
        final int kleeResult = save.getInt("Klee", 0);
        buttonKlee.setText(getString(R.string.level_klee) + " " + kleeResult + "/17");
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

        TextView buttonFischl = (TextView) findViewById(R.id.buttonFischl);
        final int fischlResult = save.getInt("Fischl", 0);
        buttonFischl.setText(getString(R.string.level_fischl) + " " + fischlResult + "/17");
        buttonFischl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Fischl.class);
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