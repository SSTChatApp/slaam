package com.example.jokeandlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
  TextView jokeTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        String Joke = getIntent().getStringExtra("Joke");
        jokeTxt = findViewById(R.id.joke);
        jokeTxt.setText(Joke);
    }
}
