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
                    Intent intent = new Intent(GameLevels_Mondstadt.this, RegionsMenu.class);
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

        TextView buttonEula = (TextView) findViewById(R.id.buttonEula);
        final int eulaResult = save.getInt("Eula", 0);
        buttonEula.setText(getString(R.string.level_eula) + " " + eulaResult + "/17");
        buttonEula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Eula.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonAlbedo = (TextView) findViewById(R.id.buttonAlbedo);
        final int albedoResult = save.getInt("Albedo", 0);
        buttonAlbedo.setText(getString(R.string.level_albedo) + " " + albedoResult + "/17");
        buttonAlbedo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Albedo.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonSucrose = (TextView) findViewById(R.id.buttonSucrose);
        final int sucroseResult = save.getInt("Sucrose", 0);
        buttonSucrose.setText(getString(R.string.level_sucrose) + " " + sucroseResult + "/17");
        buttonSucrose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Sucrose.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonAmber = (TextView) findViewById(R.id.buttonAmber);
        final int amberResult = save.getInt("Amber", 0);
        buttonAmber.setText(getString(R.string.level_amber) + " " + amberResult + "/17");
        buttonAmber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Amber.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonRazor = (TextView) findViewById(R.id.buttonRazor);
        final int razorResult = save.getInt("Razor", 0);
        buttonRazor.setText(getString(R.string.level_razor) + " " + razorResult + "/17");
        buttonRazor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Razor.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonRosaria = (TextView) findViewById(R.id.buttonRosaria);
        final int rosariaResult = save.getInt("Rosaria", 0);
        buttonRosaria.setText(getString(R.string.level_rosaria) + " " + rosariaResult + "/17");
        buttonRosaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Rosaria.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonBennett = (TextView) findViewById(R.id.buttonBennett);
        final int bennettResult = save.getInt("Bennett", 0);
        buttonBennett.setText(getString(R.string.level_bennett) + " " + bennettResult + "/17");
        buttonBennett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Bennett.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        TextView buttonDiona = (TextView) findViewById(R.id.buttonDiona);
        final int dionaResult = save.getInt("Diona", 0);
        buttonDiona.setText(getString(R.string.level_diona) + " " + dionaResult + "/17");
        buttonDiona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Mondstadt.this, Level_Mondstadt_Diona.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });
    }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(GameLevels_Mondstadt.this, RegionsMenu.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {}
    }
}