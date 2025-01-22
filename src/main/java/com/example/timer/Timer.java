package com.example.timer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Timer {
    String formatedTime;
    int seconds;
    int minutes;
    int hours;

    public String formatTime(String formatedTime, int seconds, int minutes, int hours){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        this.formatedTime = formatedTime;

        this.formatedTime = String.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds);

        return this.formatedTime;
    }

    public void InitializePause(){
        System.out.println("Iniciou");
    }

    public void Stop(){
        System.out.println("parou");
    }
}