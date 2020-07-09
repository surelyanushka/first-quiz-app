package com.example.mysecond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class book_final extends AppCompatActivity {

    private Button play_again;

    //int final_score = python.get_score();
    private TextView score_display;
    int fin_score = book_quiz.get_scores();

    public void onBackPressed(){
        Intent intent = new Intent(book_final.this, Category.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_screen);

//        score_display = (TextView) findViewById(R.id.display_score);
//        score_display.setText(String.valueOf(final_score));

        score_display = (TextView) findViewById(R.id.display_score);
        score_display.setText(String.valueOf(fin_score));


        play_again = findViewById(R.id.play_again_btn);
        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(book_final.this, Category.class);
                startActivity(intent);

            }
        });
    }
}