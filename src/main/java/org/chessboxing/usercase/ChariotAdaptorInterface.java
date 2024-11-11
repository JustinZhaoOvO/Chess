package org.chessboxing.usercase;

import chariot.util.Board;

import java.util.List;

public interface ChariotAdaptorInterface {

    List<String> getValidMoves();

    void move(String moveToPlay);

    Board getBoard();
}
