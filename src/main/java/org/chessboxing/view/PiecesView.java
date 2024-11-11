package org.chessboxing.view;
//CreateTime: 2024-11-11 9:29 a.m.

import javax.swing.*;
import java.awt.*;

public class PiecesView extends JPanel {
    private Image image;
    private Color blackgroundColor;
    private Color color;

    public PiecesView(Color color, Image image) {
        this.image = image;
        this.blackgroundColor = color;
        this.color = color;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void resetColor(){
        this.color = blackgroundColor;
    }
}
