package org.chessboxing.view;
//CreateTime: 2024-11-11 10:38 a.m.

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PiecesListener extends MouseListenerAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        Component c = (Component) e.getSource();
        c.getParent().dispatchEvent(e);
        Component component = e.getComponent();
        if (component instanceof PiecesView){
            PiecesView view = (PiecesView)component;
            view.setColor(ColorConstants.RED);
        }
    }
}
