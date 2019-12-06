package com.eric.quizme.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.eric.quizme.R;

public class GameActivity extends AppCompatActivity {
private TextView  mQuestionText;
private Button  mAnswer1;
private Button mAnswer2;
private Button mAnswer3;
private Button mAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mQuestionText=findViewById(R.id.activity_game_question_text);
        mAnswer1=findViewById(R.id.activity_game_answer1_btn);
        mAnswer2=findViewById(R.id.activity_game_answer2_btn);
        mAnswer3=findViewById(R.id.activity_game_answer3_btn);
        mAnswer4=findViewById(R.id.activity_game_answer4_btn);

    }
}
