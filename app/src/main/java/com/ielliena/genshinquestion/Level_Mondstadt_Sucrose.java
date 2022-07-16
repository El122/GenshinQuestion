package com.ielliena.genshinquestion;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Level_Mondstadt_Sucrose extends AppCompatActivity {

    Dialog modalEnd;

    public int numAnswer1;
    public int numAnswer2;
    public int numAnswer3;
    public int numAnswer4;

    Array array = new Array();
    Random random = new Random();

    public int[] answersResult = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    public int questionNumber = 0;

    protected void setEnabledButtons() {
        Button answer1 = (Button)findViewById(R.id.answer1);
        Button answer2 = (Button)findViewById(R.id.answer2);
        Button answer3 = (Button)findViewById(R.id.answer3);
        Button answer4 = (Button)findViewById(R.id.answer4);

        answer1.setEnabled(true);
        answer2.setEnabled(true);
        answer3.setEnabled(true);
        answer4.setEnabled(true);
    }

    protected void setDisabledButtons(int enabledButton) {
        Button answer1 = (Button)findViewById(R.id.answer1);
        Button answer2 = (Button)findViewById(R.id.answer2);
        Button answer3 = (Button)findViewById(R.id.answer3);
        Button answer4 = (Button)findViewById(R.id.answer4);

        switch (enabledButton) {
            case 1:
                answer2.setEnabled(false);
                answer3.setEnabled(false);
                answer4.setEnabled(false);
                break;
            case 2:
                answer1.setEnabled(false);
                answer3.setEnabled(false);
                answer4.setEnabled(false);
                break;
            case 3:
                answer1.setEnabled(false);
                answer2.setEnabled(false);
                answer4.setEnabled(false);
                break;
            case 4:
                answer1.setEnabled(false);
                answer2.setEnabled(false);
                answer3.setEnabled(false);
                break;
        }
    }

    protected void setQuestions() {
        TextView questionText = (TextView)findViewById(R.id.questionText);
        Button answer1 = (Button)findViewById(R.id.answer1);
        Button answer2 = (Button)findViewById(R.id.answer2);
        Button answer3 = (Button)findViewById(R.id.answer3);
        Button answer4 = (Button)findViewById(R.id.answer4);

        questionText.setText(array.questions_sucrose[questionNumber]);

        numAnswer1 = random.nextInt(4);
        answer1.setText(array.answers_sucrose[questionNumber][numAnswer1]);

        numAnswer2 = random.nextInt(4);
        while(numAnswer1 == numAnswer2) numAnswer2 = random.nextInt(4);
        answer2.setText(array.answers_sucrose[questionNumber][numAnswer2]);

        numAnswer3 = random.nextInt(4);
        while(numAnswer3 == numAnswer2 || numAnswer3 == numAnswer1) numAnswer3 = random.nextInt(4);
        answer3.setText(array.answers_sucrose[questionNumber][numAnswer3]);

        numAnswer4 = random.nextInt(4);
        while(numAnswer4 == numAnswer2 || numAnswer4 == numAnswer1 || numAnswer4 == numAnswer3) numAnswer4 = random.nextInt(4);
        answer4.setText(array.answers_sucrose[questionNumber][numAnswer4]);
    }

    public void backToLevelsMenu() {
        try {
            Intent intent = new Intent(Level_Mondstadt_Sucrose.this, GameLevels_Mondstadt.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {}
    }

    protected void checkAnswer(int clickedButton) {
        ImageView questionImage = (ImageView)findViewById(R.id.questionImage);
        final Animation a = AnimationUtils.loadAnimation(Level_Mondstadt_Sucrose.this, R.anim.alpha);

        if(clickedButton == 0) {
            questionImage.setImageResource(R.drawable.question_image);
            answersResult[questionNumber] = 1;
            questionImage.setAnimation(a);
        } else {
            questionImage.setImageResource(R.drawable.question_false);
            answersResult[questionNumber] = -1;
            questionImage.setAnimation(a);
        }
    }

    protected void updateProgressBar() {
        final int[] progress = {R.id.point1,R.id.point2,R.id.point3,R.id.point4,R.id.point5,R.id.point6,R.id.point7,R.id.point8,R.id.point9,R.id.point10,R.id.point11,R.id.point12,R.id.point13,R.id.point14,R.id.point15,R.id.point16,R.id.point17};

        TextView progressBar = findViewById(progress[questionNumber]);
            progressBar.setBackgroundResource(
                    answersResult[questionNumber] == 0 ? R.drawable.style_points :
                            answersResult[questionNumber] == -1 ? R.drawable.style_points_false : R.drawable.style_points_true);
    }

    protected void saveResult() {
        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        SharedPreferences.Editor editor = save.edit();
        int trueAnswers = 0;
        for(int num : answersResult) {
            if (num == 1) ++trueAnswers;
        }
        editor.putInt("Sucrose", trueAnswers);
        editor.commit();
    }

    protected void callDialog() {
        modalEnd = new Dialog(this);
        modalEnd.requestWindowFeature(Window.FEATURE_NO_TITLE);
        modalEnd.setContentView(R.layout.modalend);
        modalEnd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        modalEnd.setCancelable(false);

        TextView modalEndText = (TextView) modalEnd.findViewById(R.id.modalEndText);
        ImageView modalEndImage = (ImageView) modalEnd.findViewById(R.id.modalEndImage);

        modalEndText.setText(R.string.sucrose_phrase);
        modalEndImage.setImageResource(R.drawable.modal_sucrose);

        TextView backMenu = (TextView) modalEnd.findViewById(R.id.backMenu);
        backMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level_Mondstadt_Sucrose.this, GameLevels_Mondstadt.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
                modalEnd.dismiss();
            }
        });

        TextView nextLevel = (TextView) modalEnd.findViewById(R.id.nextLevel);
        nextLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level_Mondstadt_Sucrose.this, Level_Mondstadt_Amber.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
                modalEnd.dismiss();
            }
        });

        modalEnd.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_mondstat);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button buttonBack = (Button) findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToLevelsMenu();
            }
        });

        TextView text_levels = findViewById(R.id.levelName);
        text_levels.setText(R.string.level_sucrose);

        Button answer1 = (Button)findViewById(R.id.answer1);
        Button answer2 = (Button)findViewById(R.id.answer2);
        Button answer3 = (Button)findViewById(R.id.answer3);
        Button answer4 = (Button)findViewById(R.id.answer4);


        setQuestions();

        answer1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN) {
                    setDisabledButtons(1);
                    checkAnswer(numAnswer1);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP) {
                    updateProgressBar();
                    ++questionNumber;

                    if(questionNumber == 17) {
                        saveResult();
                        callDialog();
                    } else {
                        setQuestions();
                        setEnabledButtons();
                    }
                }

                return true;
            }
        });
        answer2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN) {
                    setDisabledButtons(2);
                    checkAnswer(numAnswer2);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP) {
                    updateProgressBar();
                    ++questionNumber;

                    if(questionNumber == 17) {
                        saveResult();
                        callDialog();
                    } else {
                        setQuestions();
                        setEnabledButtons();
                    }
                }

                return true;
            }
        });
        answer3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN) {
                    setDisabledButtons(3);
                    checkAnswer(numAnswer3);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP) {
                    updateProgressBar();
                    ++questionNumber;

                    if(questionNumber == 17) {
                        saveResult();
                        callDialog();
                    } else {
                        setQuestions();
                        setEnabledButtons();
                    }
                }

                return true;
            }
        });
        answer4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN) {
                    setDisabledButtons(4);
                    checkAnswer(numAnswer4);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP) {
                    updateProgressBar();
                    ++questionNumber;

                    if(questionNumber == 17) {
                        saveResult();
                        callDialog();
                    } else {
                        setQuestions();
                        setEnabledButtons();
                    }
                }

                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Level_Mondstadt_Sucrose.this, GameLevels_Mondstadt.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {}
    }
}