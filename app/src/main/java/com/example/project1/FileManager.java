package com.example.project1;


public class FileManager {


        private String userName;
        private int userScore;
        private int time;


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


        public void timer()  {
            //TODO
        }
}
