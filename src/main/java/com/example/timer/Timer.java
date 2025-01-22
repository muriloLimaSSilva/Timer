package com.example.timer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Timer {
    private String formatedTime;
    private int seconds;
    private int minutes;
    private int hours;

    @FXML
    protected Label labelTime;

    public String formatTime(int seconds, int minutes, int hours){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;

        // Atualiza a variável formatada
        this.formatedTime = String.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds);

        return this.formatedTime;
    }

    public void IncrementTime(){
        // Incrementa o tempo
        this.seconds++;
        if (this.seconds >= 60){
            this.seconds = 0;
            this.minutes++;
            if (this.minutes >= 60){
                this.minutes = 0;
                this.hours++;
            }
        }

        // Formata o tempo após o incremento
        String currentTime = formatTime(this.seconds, this.minutes, this.hours);

        System.out.println(currentTime); // Para ver o tempo no console
        labelTime.setText(currentTime);
    }

    public void onStartPause(ActionEvent event){
        // Inicia o incremento do tempo
        IncrementTime();
    }

    public void onStop(ActionEvent event) {

    }
}
