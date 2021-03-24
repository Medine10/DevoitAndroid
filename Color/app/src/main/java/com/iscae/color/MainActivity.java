package com.iscae.color;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    View linearLayout;
    Button clickMe;
    int[] color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color = new int[] {Color.YELLOW,Color.BLACK,Color.GRAY,Color.BLUE,Color.CYAN,Color.GREEN};
        linearLayout = findViewById(R.id.linearLayout);
        clickMe = findViewById(R.id.click);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int arayLength = color.length;

                Random random = new Random();
                int rNum = random.nextInt(arayLength);

                linearLayout.setBackgroundColor(color[rNum]);
            }
        });
    }
}