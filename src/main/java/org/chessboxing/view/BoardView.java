package org.chessboxing.view;
//CreateTime: 2024-11-11 10:26 a.m.

import javax.swing.*;
import java.awt.*;

public class BoardView extends JPanel {
//    Image[][] board;
//    public BoardView(Image[][] board) {
//        this.board = board;
//    }
//
//    public void updateBoard(Image[][] board) {
//        this.board = board;
//        this.updateUI();
//    }

    public void resetColors() {
        Component[] children = this.getComponents();
        for (Component child : children) {
            if (child instanceof PiecesView piecesView) {
                piecesView.resetColor();
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
