package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TitleScreen extends AppCompatActivity
{
    private Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.TitleNextButton);

    }

    public void onClickNext(View v) {
//        Intent action1 = new Intent(getApplicationContext(), PlayerInfo.class);
//        startActivity(action1);
        FileManager f = new FileManager();
        f.changeGUI(v);
    }

}