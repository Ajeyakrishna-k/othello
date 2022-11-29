package com.aryexgames.entities;

import com.aryexgames.entities.constants.PlayerSymbol;
import com.aryexgames.entities.intefaces.GameTiles;

import static com.aryexgames.entities.constants.PlayerSymbol.*;

public class GameLogic {

    public static boolean move(PlayerSymbol symbol, GameBoard gameBoard, int x, int y){

        GameTiles[][] gameTiles = gameBoard.getGameTiles();

        if(x >= gameTiles.length || y >= gameTiles.length || x < 0 || y < 0 || gameTiles[x][y].getPlayerSymbol() != NP){
            return false;
        }

        int[][] dir = {{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};

        boolean flag = false;
        PlayerSymbol oppositeSymbol = symbol == P1 ? P2 : P1;

        for(int i = 0; i < dir.length; i++){
            int dx = dir[i][0];
            int dy = dir[i][1];

            int count = 0;

            for(int a = x+dx,b = y+dy; a < gameTiles.length && a >= 0 && b < gameTiles.length && b >=0; a+= dx, b += dy){
                if(gameTiles[a][b].getPlayerSymbol() == oppositeSymbol){
                    count++;
                }
                else if(count > 0 && gameTiles[a][b].getPlayerSymbol() == symbol){
                    break;
                }
                else{
                    count = 0;
                    break;
                }
            }

            if(count > 0) flag = true;

            //TODO :  maybe keep it outside the loop??

            for(int j = 0,a = x+dx,b = y+dy; j < count; j++, a+= dx, b += dy){
                gameTiles[a][b].setPlayerSymbol(symbol);
            }

        }
        if(flag) gameTiles[x][y].setPlayerSymbol(symbol);
        return flag;
    }
}
