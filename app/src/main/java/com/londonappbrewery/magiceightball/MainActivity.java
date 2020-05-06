package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final ImageView imageView = findViewById(R.id.ImageRenderer);
       final int[] imageChoices = new int[]{
               R.drawable.ball1,
               R.drawable.ball2,
               R.drawable.ball3,
               R.drawable.ball4,
               R.drawable.ball5
       };
        Button button =findViewById(R.id.askButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random RandomNumberGenerator = new Random();
                int number = RandomNumberGenerator.nextInt(4);
                imageView.setImageResource(imageChoices[number]);

            }
        });



    }
}
