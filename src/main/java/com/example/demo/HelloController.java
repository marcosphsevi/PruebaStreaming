package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class HelloController {

    private static boolean hola = false;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        if (!hola){
            AudioStreamer.reproducir("https://dn710306.ca.archive.org/0/items/808sandheartbreak/03-Heartless.mp3");
            hola = true;
        }else{
            AudioStreamer.pausar();
            hola = false;
        }
    }
}
