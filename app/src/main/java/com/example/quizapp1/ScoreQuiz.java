package com.example.quizapp1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.github.lzyzsd.circleprogress.DonutProgress;


public class ScoreQuiz  extends AppCompatActivity {
    Button btnlogout;
    Button btntryagain;
    DonutProgress donutProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socor);
        btnlogout=findViewById(R.id.button2);
        btntryagain=findViewById(R.id.button);
        donutProgress=findViewById(R.id.donut_progress);
        btntryagain.setOnClickListener(view -> {
            startActivity(new Intent(ScoreQuiz.this,quiz1.class));
        });
        Toast.makeText(this, "you got " + quiz1.score, Toast.LENGTH_SHORT).show();
        donutProgress.setDonut_progress(String.valueOf(quiz1.score));

    }
}
