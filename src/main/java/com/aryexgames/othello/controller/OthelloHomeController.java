package com.aryexgames.othello.controller;

import com.aryexgames.entities.GameBoard;
import com.aryexgames.entities.Player;
import com.aryexgames.entities.PlayerTypeImpl;
import com.aryexgames.entities.constants.GameBoardTypes;
import com.aryexgames.entities.constants.PlayerSymbol;
import com.aryexgames.entities.intefaces.PlayerType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class OthelloHomeController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField playerOneName;

    @FXML
    private TextField playerTwoName;

    @FXML
    private ColorPicker playerOneColor;

    @FXML
    private ColorPicker playerTwoColor;

    @FXML
    private ChoiceBox<String> gameBoard;

    @FXML
    private Button startGameButton;



    @FXML
    protected void startGame() {

        welcomeText.setText("Game Starting....");

        Player player1 = new Player(playerOneName.getText(), new PlayerTypeImpl(PlayerSymbol.P1,playerOneColor.getValue()));
        Player player2 = new Player(playerTwoName.getText(), new PlayerTypeImpl(PlayerSymbol.P2,playerTwoColor.getValue()));

        System.out.println(player1);
        System.out.println(player2);


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playerOneColor.setValue(Color.WHITE);
        playerTwoColor.setValue(Color.BLACK);
        List<String> gameBoardTypes = new ArrayList<>();
        for(GameBoardTypes value : GameBoardTypes.values()){
            gameBoardTypes.add(value.getGameBoardName());
        }
        gameBoard.getItems().addAll(gameBoardTypes);
        gameBoard.setValue(gameBoardTypes.get(0));
    }
}
