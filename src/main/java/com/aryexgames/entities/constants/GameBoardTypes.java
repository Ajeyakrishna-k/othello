package com.aryexgames.entities.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public enum GameBoardTypes {
    _8X8("Small Board"),
    _16X16("Medium Board"),
    _32X32("Large Board");

    @Getter @Setter
    private String gameBoardName;
}
