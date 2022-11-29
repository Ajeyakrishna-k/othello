package com.aryexgames.entities;

import com.aryexgames.entities.intefaces.PlayerType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Player {

    @Setter @Getter
    private String playerName;

    @Getter @Setter
    private PlayerType playerType;


    @Override
    public boolean equals(Object obj) {
        return playerType.equals(obj);
    }

}
