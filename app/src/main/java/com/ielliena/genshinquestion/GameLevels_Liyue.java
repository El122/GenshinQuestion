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

public class GameLevels_Liyue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels_liyue);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button buttonBack = (Button) findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels_Liyue.this, RegionsMenu.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
    }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(GameLevels_Liyue.this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {}
    }
}