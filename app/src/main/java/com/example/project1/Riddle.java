package com.example.project1;


import java.lang.reflect.Array;

public class Riddle extends FileManager {


    String[] riddles;


    Riddle(String userName, int userScore) {
        super(userName, userScore);
    }


    public void changeXMLView() {
        // TODO
    }


    String[] getRiddlesArray() {
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