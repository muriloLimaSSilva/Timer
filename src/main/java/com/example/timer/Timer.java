package com.example.timer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.time.Duration;
import java.time.LocalTime;

public class Timer {

    private Duration duration;  // Para acumular o tempo
    @FXML
    protected Label labelTime;

    public Timer() {
        // Inicializa a duração com zero segundos
        duration = Duration.ZERO;
    }

    // Método para formatar o tempo no formato HH:mm:ss
    public String formatTime(LocalTime time) {
        return time.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    // Incrementa o tempo
    public void IncrementTime() {

        // Incrementa 1 segundo
        duration = duration.plusSeconds(1);

        // Converte a duração acumulada para LocalTime
        LocalTime time = LocalTime.ofSecondOfDay(duration.getSeconds());

        // Formata o tempo e atualiza o Label
        String currentTime = formatTime(time);
        System.out.println(currentTime);  // Para ver o tempo no console
        labelTime.setText(currentTime);
    }

    // Método acionado para iniciar ou pausar o incremento do tempo
    public void onStartPause(ActionEvent event) {
        IncrementTime();
    }


    public void onStop(ActionEvent event) {
        // Aqui você pode adicionar lógica para parar ou resetar o timer
    }
}
