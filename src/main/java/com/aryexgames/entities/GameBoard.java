package com.aryexgames.entities;

import com.aryexgames.entities.intefaces.GameTiles;
import lombok.Getter;
import lombok.Setter;

public class GameBoard {

    @Setter @Getter
    private GameTiles[][] gameTiles;

    public GameBoard(GameTiles[][] gameTiles){
        this.gameTiles = gameTiles;
    }

}
