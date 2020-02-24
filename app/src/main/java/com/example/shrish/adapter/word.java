package com.example.shrish.adapter;

/**
 * Created by SHRISH on 10-03-2018.
 */

public class word {
    String english;
    String malayalam;// A default contructor is created with single parameter everytime we create a class
    int sound;
    int image;//how integer for omage and sound?


    public void setEnglish(String english) {
        this.english = english;
    } //setter method

    public void setMalayalam(String malayalam) {
        this.malayalam = malayalam;
    }//Inputs data

    public void setSound(int sound){this.sound = sound;}

    public void setImage( int image){this.image=image;}

    public String getEnglish() {
        return english;
    }

    public String getMalayalam() {      //getter method
        return malayalam;
    }

    public int getSound(){
        return sound;
    }
    public int getImage()
    {
        return image;
    }

    public word(String english,String malayalam,int sound,int image )
    {
        this.english=english;                 //returns data

        this.malayalam=malayalam;

        this.image=image;

        this.sound=sound;
    }
}
