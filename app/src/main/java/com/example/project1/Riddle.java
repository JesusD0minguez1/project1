package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.view.*;


public class Riddle extends FileManager {


    String[] riddles;
    ProgressBar progBar = (ProgressBar) findViewById(R.id.riddleProg);


    Riddle(String userName, int userScore) {
        super(userName, userScore);
    }


    public void changeXMLView() {
        // TODO
        setContentView(R.layout.riddle_screen);
    }


    public String[] getRiddlesArray() {
        return riddles;
    }


    public String getRiddle(int index) {
        return riddles[index];
    }


    @Override
    public void timer() {

    }


    public void retry() {

    }


    //TODO: Input Box
    //TODO: textDisplay
}