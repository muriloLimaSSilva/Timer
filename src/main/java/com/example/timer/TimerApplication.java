package com.example.timer;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TimerApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Carregando o arquivo FXML
        FXMLLoader fxmlLoader = new FXMLLoader(TimerApplication.class.getResource("timer.fxml"));

        // Criando nova cena com o FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Título da janela
        stage.setTitle("Timer");
        stage.setScene(scene);

        // Exibindo a janela
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
