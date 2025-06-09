import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class SpaceInvaders extends JPanel{
    //board
    int tileSize = 32;
    int row = 16;
    int column = 16;
    int boardWidth = tileSize * column;
    int boardLength = tileSize * row;

    SpaceInvaders(){
        setPreferredSize(new Dimension(boardWidth,boardLength));
        setBackground(Color.black);
        
    }
}
