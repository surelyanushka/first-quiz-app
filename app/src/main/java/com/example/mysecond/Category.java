package com.example.mysecond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity {

    public void onBackPressed(){
        Intent intent = new Intent(Category.this, MainActivity.class);
        startActivity(intent);
    }

    private Button Category1;
    private Button Category2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Category1 = findViewById(R.id.category1);
        Category1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Category.this, python.class);
                startActivity(intent);
            }
        });

        Category2 = findViewById(R.id.category2);
        Category2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Category.this, book_quiz.class);
                startActivity(intent);
            }
        });
    }
}
