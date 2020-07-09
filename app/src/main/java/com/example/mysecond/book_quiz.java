package com.example.mysecond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class book_quiz extends AppCompatActivity {

    private TextView question, score;
    private Button option1;
    private Button option2;
    private Button option3;
    private Button option4;

    private BookRepo question_set = new BookRepo();

    private String ans;
    public static int current_score;
    private int no_of_q = question_set.question_set.length;
    Random rand_num;
    //int TheRandom;
    int i = 0;
    //int array[] = new int[no_of_q];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_quiz);

        rand_num = new Random();

        option1 = (Button) findViewById(R.id.btn1);
        option2 = (Button) findViewById(R.id.btn2);
        option3 = (Button) findViewById(R.id.btn3);
        option4 = (Button) findViewById(R.id.btn4);

        score = (TextView) findViewById(R.id.your_score);
        question = (TextView) findViewById(R.id.Question_view);

        current_score =  0;

        String y = "Score: " + current_score ;

        score.setText(y);
        //TheRandom = rand_num.nextInt(no_of_q);

        updateQuestion(i=0);
        //updateQuestion(rand_num.nextInt(no_of_q));
        //updateRandomNo(array);

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option1.getText().toString() == ans ){
                    current_score++;
                    //option1.setBackgroundColor(Color.parseColor("#ADFF2F"));
                    score.setText("Score: " + current_score);
                    //updateRandomNo(array);
                    //updateQuestion(rand_num.nextInt(no_of_q));
                    i = i + 1;
                    if(i < no_of_q ) {
                        updateQuestion(i);
                    }
                    else{
                        Intent intent = new Intent(book_quiz.this, Final_screen.class);
                        startActivity(intent);
                    }
                }
                else
                {
                    //option1.setBackgroundColor(Color.parseColor("#CD5C5C"));

                    Intent intent = new Intent(book_quiz    .this, Final_screen.class);
                    startActivity(intent);

                }
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option2.getText().toString() == ans ){
                    current_score++;
                    //option2.setBackgroundColor(Color.parseColor("#ADFF2F"));
                    score.setText("Score: " + current_score);
                    //updateQuestion(rand_num.nextInt(no_of_q));
                    //updateRandomNo(array);
                    i = i + 1;
                    if(i < no_of_q) {
                        updateQuestion(i);
                    }
                    else {
                        Intent intent = new Intent(book_quiz.this, Final_screen.class);
                        startActivity(intent);
                    }
                }
                else
                {
                    //option2.setBackgroundColor(Color.parseColor("#CD5C5C"));

                    Intent intent = new Intent(book_quiz.this, Final_screen.class);
                    startActivity(intent);

                }
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(option3.getText().toString() == ans ){
                    current_score++;
                    //option3.setBackgroundColor(Color.parseColor("#ADFF2F"));
                    score.setText("Score: " + current_score);
                    //updateRandomNo(array);
                    //updateQuestion(rand_num.nextInt(no_of_q));
                    i = i + 1;
                    if(i < no_of_q) {
                        updateQuestion(i);
                    }
                    else{
                        Intent intent = new Intent(book_quiz.this, Final_screen.class);
                        startActivity(intent);
                    }
                }
                else
                {
                    Intent intent = new Intent(book_quiz.this, Final_screen.class);
                    startActivity(intent);
                }

            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(option4.getText().toString() == ans ){
                    current_score++;
                    //option4.setBackgroundColor(Color.parseColor("#ADFF2F"));
                    score.setText("Score: " + current_score);
                    // updateQuestion(rand_num.nextInt(no_of_q));
                    //updateRandomNo(array);
                    i = i + 1;
                    if(i < no_of_q) {
                        updateQuestion(i);
                    }
                    else{
                        Intent intent = new Intent(book_quiz.this, Final_screen.class);
                        startActivity(intent);
                    }
                }
                else
                {
                    //option4.setBackgroundColor(Color.parseColor("#CD5C5C"));
                    //game_over();
                    Intent intent = new Intent(book_quiz.this, Final_screen.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void updateQuestion(int num){

        question.setText(question_set.get_question(num));
        option1.setText(question_set.get_option1(num));
        option2.setText(question_set.get_option2(num));
        option3.setText(question_set.get_option3(num));
        option4.setText(question_set.get_option4(num));

        ans = question_set.get_correct_ans(num);
    }

    public static int get_score(){
        return current_score;
    }
}