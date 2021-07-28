package com.abmcollegeatnyima.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rng = new Random();
    ImageView img, img2, img3, img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.imageView);
        img2 = (ImageView) findViewById(R.id.imageView2);
        img3 = (ImageView) findViewById(R.id.imageView3);
        img4 = (ImageView) findViewById(R.id.imageView4);

        Button b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollTheDice(view);
            }
        });

    }

    public void rollTheDice(View v)
    {
        int n = rng.nextInt(6) + 1;
        int n2 = rng.nextInt(6) + 1;
        int n3 = rng.nextInt(6) + 1;
        int n4 = rng.nextInt(6) + 1;


        switch(n)
        {
            case 1: img.setImageResource(R.drawable.dice1);break;
            case 2: img.setImageResource(R.drawable.dice2);break;
            case 3: img.setImageResource(R.drawable.dice3);break;
            case 4: img.setImageResource(R.drawable.dice4);break;
            case 5: img.setImageResource(R.drawable.dice5);break;
            case 6: img.setImageResource(R.drawable.dice6);break;
        }

        switch(n2)
        {
            case 1: img2.setImageResource(R.drawable.dice1);break;
            case 2: img2.setImageResource(R.drawable.dice2);break;
            case 3: img2.setImageResource(R.drawable.dice3);break;
            case 4: img2.setImageResource(R.drawable.dice4);break;
            case 5: img2.setImageResource(R.drawable.dice5);break;
            case 6: img2.setImageResource(R.drawable.dice6);break;
        }

        switch(n3)
        {
            case 1: img3.setImageResource(R.drawable.dice1);break;
            case 2: img3.setImageResource(R.drawable.dice2);break;
            case 3: img3.setImageResource(R.drawable.dice3);break;
            case 4: img3.setImageResource(R.drawable.dice4);break;
            case 5: img3.setImageResource(R.drawable.dice5);break;
            case 6: img3.setImageResource(R.drawable.dice6);break;
        }

        switch(n4)
        {
            case 1: img4.setImageResource(R.drawable.dice1);break;
            case 2: img4.setImageResource(R.drawable.dice2);break;
            case 3: img4.setImageResource(R.drawable.dice3);break;
            case 4: img4.setImageResource(R.drawable.dice4);break;
            case 5: img4.setImageResource(R.drawable.dice5);break;
            case 6: img4.setImageResource(R.drawable.dice6);break;
        }

    }


}