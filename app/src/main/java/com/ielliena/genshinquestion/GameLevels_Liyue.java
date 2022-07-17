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

        TextView buttonQiqi = (TextView) findViewById(R.id.buttonQiqi);
        final int qiqiResult = save.getInt("Qiqi", 0);
        buttonQiqi.setText(getString(R.string.level_qiqi) + " " + qiqiResult + "/17");
        buttonQiqi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(GameLevels_Liyue.this, Level_Liyue_Qiqi.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });
    }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(GameLevels_Liyue.this, RegionsMenu.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {}
    }
}