package com.example.quizapp1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class quiz2   extends AppCompatActivity {
    Button btnnext;
    RadioGroup btnradio;
    RadioButton btnradoui;
    RadioButton btnradnon;
    Button btnlogout;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        btnradio = findViewById(R.id.radiogrp);
        btnradoui = findViewById(R.id.radioButton);
        btnradnon = findViewById(R.id.radioButton2);
        btnnext = findViewById(R.id.button3);
        btnlogout = findViewById(R.id.button2);
        btnradio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int CheckedButtonId) {
                switch (CheckedButtonId) {
                    case R.id.radioButton:
                        Toast.makeText(getApplicationContext(), "Correct answer", Toast.LENGTH_SHORT).show();
                        btnnext.setOnClickListener(view -> {
                            quiz1.score+=20;
                            Intent intent=new Intent(quiz2.this, quiz3.class);
                            startActivity(intent);
                        });
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(getApplicationContext(), "Wrong answer", Toast.LENGTH_SHORT).show();
                        btnnext.setOnClickListener(view -> {
                            startActivity(new Intent(quiz2.this, quiz3.class));
                        });
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Please select a one", Toast.LENGTH_SHORT).show();
                        break;


                }
            }
        });
    }
}
