package com.ielliena.genshinquestion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RegionsMenu extends AppCompatActivity {

    private int activeRegion = 0;

    private String[] regions = {"Мондштадт", "Ли Юэ", "Инадзума"};
    private int[] regionsBack = {R.drawable.mondstast_back, R.drawable.liue_back, R.drawable.inazuma_back};

    private void setRegion(int i) {
        RelativeLayout regionBack = (RelativeLayout) findViewById(R.id.regionBack);
        regionBack.setBackgroundResource(regionsBack[i]);

        TextView regionName = (TextView) findViewById(R.id.regionName);
        regionName.setText(regions[i]);

        Button startRegion = (Button)findViewById(R.id.startRegion);
        startRegion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent();
                    switch (activeRegion) {
                        case 0:
                            intent = new Intent(RegionsMenu.this, GameLevels_Mondstadt.class);
                            break;
                        case 1:
                            intent = new Intent(RegionsMenu.this, GameLevels_Liyue.class);
                            break;
                        case 2:
                            intent = new Intent(RegionsMenu.this, GameLevels_Inazuma.class);
                            break;
                    }
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        SharedPreferences.Editor editor = save.edit();
        editor.putInt("ActiveRegion", i);
        editor.commit();

        Button prev_region = (Button) findViewById(R.id.prev_region);
        if(i == 0) {
            prev_region.setVisibility(View.INVISIBLE);
        } else {
            prev_region.setVisibility(View.VISIBLE);
        }

        Button next_region = (Button) findViewById(R.id.next_region);
        if(i == 2) {
            next_region.setVisibility(View.INVISIBLE);
        } else {
            next_region.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regions_menu);

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        activeRegion = save.getInt("ActiveRegion", 0);

        setRegion(activeRegion);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button buttonBack = (Button) findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(RegionsMenu.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });

        Button prev_region = (Button) findViewById(R.id.prev_region);
        prev_region.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(activeRegion > 0) setRegion(--activeRegion);
                } catch (Exception e) {}
            }
        });

        Button next_region = (Button) findViewById(R.id.next_region);
        next_region.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(activeRegion < 2) setRegion(++activeRegion);
                } catch (Exception e) {}
            }
        });
    }
    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(RegionsMenu.this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {}
    }
}