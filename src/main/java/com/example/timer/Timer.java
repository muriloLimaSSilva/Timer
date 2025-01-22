package com.example.timer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Timer {
    private String formatedTime;
    private int seconds;
    private int minutes;
    private int hours;


    public String formatTime(int seconds, int minutes, int hours){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;

        this.formatedTime = String.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds);

        return this.formatedTime;
    }

    public void onStartPause(ActionEvent event){
        System.out.println("Oi");
    }


    public void onStop(ActionEvent event) {
    }
}
