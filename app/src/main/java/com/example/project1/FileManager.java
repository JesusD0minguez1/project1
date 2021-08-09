package com.example.project1;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class FileManager extends AppCompatActivity {


        private String userName;
        private int userScore;
        private int time;


        FileManager(String userName, int userScore) {
            this.userName = userName;
            this.userScore = userScore;
        }


        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }


        public String getUserName() {
            return userName;
        }


        public void setUserName(String newName) {
            userName = newName;
        }


        public boolean checkCorrect() {
            return true;
        }


        public void displayImages() {
            //TODO
        }


        public void hideImages() {
            //TODO
        }


        public void timer()  {
            //TODO
        }
}
