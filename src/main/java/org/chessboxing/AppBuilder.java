package org.chessboxing;
//CreateTime: 2024-11-10 11:46 p.m.

import chariot.util.Board;
import org.chessboxing.view.BoardView;

import javax.swing.*;

public class AppBuilder extends JFrame {

    private int ScreenOriginalLocationX = 450;
    private int ScreenOriginalLocationY = 250;
    private int ScreenOriginalSizeX = 614;
    private int ScreenOriginalSizeY = 437;
    private String WindowName = "ChessBoxing";
    public AppBuilder() {
        //set Window args
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(ScreenOriginalLocationX, ScreenOriginalLocationY);
        this.setSize(ScreenOriginalSizeX, ScreenOriginalSizeY);
        this.setTitle(WindowName);
        BoardView boardView = new BoardView();
        boardView.setSize(Math.min(ScreenOriginalSizeX, ScreenOriginalSizeY), Math.min(ScreenOriginalSizeX, ScreenOriginalSizeY));
        this.add(boardView);

        this.setVisible(true);
    }
}
