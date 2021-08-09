package com.example.project1;


import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FileManager extends AppCompatActivity {


        private String userName;
        private int userScore;
        private int time;

        FileManager(){}
        FileManager(String userName, int userScore) {
            this.userName = userName;
            this.userScore = userScore;
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

        public void changeGUI(View v)
        {
            int click = 0;
            switch (click)
            {
                case  0:
                    setContentView(R.layout.activity_main);
                    click +=1;
                break;
                case 1:
                    setContentView(R.layout.activity_player_info);
                    click +=1;
                break;
                case 2:
                    setContentView(R.layout.riddle_screen);
                    click +=1;
                break;
                case 3:
                    setContentView(R.layout.game_over);
                    click +=1;
                break;
            }

        }



    public void timer()  {
            //TODO
        }
}
