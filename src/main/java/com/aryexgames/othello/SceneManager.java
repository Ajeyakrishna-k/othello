package com.aryexgames.othello;

import com.aryexgames.othello.scenes.HomeScene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.IOException;

public class SceneManager {


    private Stage stage;

    private HomeScene homeScene;


    public SceneManager(Stage stage) {
        this.stage = stage;
        this.homeScene = new HomeScene(stage);
    }

    public void home() {
        this.homeScene.show();
    }
}
