package org.chessboxing.usercase;
//CreateTime: 2024-11-10 11:46 p.m.

import org.chessboxing.entities.ImageConstants;

import java.awt.*;

public class ChariotParser {


    public int[] parsingAPosition(String pos){
        //len(pos) == 2 & pos is a coordinate at chessboard, e.g. e1, g2
        int[] ans = new int[2];
        ans[0] = pos.charAt(0) - Constants.UPPERLEFTLETTER;
        ans[1] = Constants.UPPERLEFTNUMBER - pos.charAt(1);
        return ans;
    }

    public Image[][] parsingABoard(String board){
        Image[][] ans = new Image[Constants.SIZEOFABOARD][Constants.SIZEOFABOARD];
        String[] rows = board.split("\n");
        for (int i = 0; i < Constants.SIZEOFABOARD; i++) {
            char[] row = rows[i].toCharArray();
            for (int j = 0; j < Constants.SIZEOFABOARD; j+=2) {
                Image cur = null;
                switch (row[j]) {
                    case Constants.BLACKPAWN -> cur = ImageConstants.BLACKPAWN;
                    case Constants.WHITEPAWN -> cur = ImageConstants.WHITEPAWN;
                    case Constants.BLACKBISHOP -> cur = ImageConstants.BLACKBISHOP;
                    case Constants.WHITEBISHOP -> cur = ImageConstants.WHITEBISHOP;
                    case Constants.BLACKKNIGHT -> cur = ImageConstants.BLACKKNIGHT;
                    case Constants.WHITEKNIGHT -> cur = ImageConstants.WHITEKNIGHT;
                    case Constants.BLACKQUEEN -> cur = ImageConstants.BLACKQUEEN;
                    case Constants.WHITEQUEEN -> cur = ImageConstants.WHITEQUEEN;
                    case Constants.BLACKKING -> cur = ImageConstants.BLACKKING;
                    case Constants.WHITEKING -> cur = ImageConstants.WHITEKING;
                    case Constants.BLACKROOK -> cur = ImageConstants.BLACKROOK;
                    case Constants.WHITEROOK -> cur = ImageConstants.WHITEROOK;
                }ans[i][j] = cur;
            }
        }return ans;
    }
}
