package com.aryexgames.othello.scenes;

import com.aryexgames.othello.Othello;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeScene {

    private Stage stage;

    private static final String HOMEPAGE = "othello-home.fxml";

    private static final String TITLE = "Othello";

    public HomeScene(Stage stage) {
        this.stage = stage;
    }

    public void show(){
        FXMLLoader fxmlLoader = new FXMLLoader(Othello.class.getResource(HOMEPAGE));

        Scene scene = null;

        try {
            scene = new Scene(fxmlLoader.load(), 600, 400);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        stage.setTitle(TITLE);
        stage.setScene(scene);
        stage.show();
    }
}
