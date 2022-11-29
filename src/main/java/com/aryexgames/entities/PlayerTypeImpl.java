package com.aryexgames.entities;

import com.aryexgames.entities.constants.PlayerSymbol;
import com.aryexgames.entities.intefaces.PlayerType;
import javafx.scene.paint.Color;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlayerTypeImpl implements PlayerType {

    @Setter @Getter
    private PlayerSymbol playerSymbol;

    @Getter @Setter
    private Color playerColor;
}
