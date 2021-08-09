package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.HashMap;

public class RiddleScreenActivity extends AppCompatActivity {
    HashMap<String, String> Riddles = new HashMap<String, String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.riddle_screen);
        boolean isCorrect = false;


        Riddles.put("What has to be broken before you can use it?", "Egg");
        Riddles.put("I’m tall when I’m young, and I’m short when I’m old. What am I?", "A candle");
        Riddles.put("What is full of holes but still holds water?", "A sponge");
        Riddles.put("What goes up but never comes down?", "Your age");
        Riddles.put("What can you break, even if you never pick it up or touch it?", "A promise");
        Riddles.put("What can you keep after giving to someone?", "your word");
        Riddles.put("What can’t talk but will reply when spoken to?", "an echo");

    }

    public void checkCorrect(View V)
    {

    }


}