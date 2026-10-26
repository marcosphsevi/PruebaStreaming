package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class AudioStreamer {
    private static MediaPlayer mediaPlayer;

    public static void reproducir(String audioUrl) {
        if (mediaPlayer == null) {
            try {
                Media media = new Media(audioUrl);
                mediaPlayer = new MediaPlayer(media);
                //mediaPlayer.play();
                System.out.println("Reproduciendo streaming...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        mediaPlayer.play();
    }

    public static void pausar() {
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    public static void detener() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.dispose();
            mediaPlayer = null;
        }
    }
}