package com.example.quizapp1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;

public class quiz4  extends AppCompatActivity {
    Button btnnext;
    RadioGroup btnradio;
    RadioButton btnradoui;
    RadioButton btnradnon;
    Button btnlogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        btnradio = findViewById(R.id.radiogrp);
        btnradoui = findViewById(R.id.radioButton);
        btnradnon = findViewById(R.id.radioButton2);
        btnnext = findViewById(R.id.button3);
        btnlogout=findViewById(R.id.button2);
        btnradio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int CheckedButtonId) {
                switch (CheckedButtonId) {
                    case R.id.radioButton:
                        Toast.makeText(getApplicationContext(), "Wrong answer", Toast.LENGTH_SHORT).show();
                        btnnext.setOnClickListener(view -> {
                            startActivity(new Intent(quiz4.this, quiz5.class));
                        });
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(getApplicationContext(), "Correct answer", Toast.LENGTH_SHORT).show();
                        btnnext.setOnClickListener(view -> {
                            quiz1.score+=20;
                            Intent intent=new Intent(quiz4.this, quiz5.class);
                            startActivity(intent);
                        });
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Please select a one", Toast.LENGTH_SHORT).show();
                        break;


                }
            }
        });
    }
    public void loginout(){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(quiz4.this,MainActivity.class));
    }
}
