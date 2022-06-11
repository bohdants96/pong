package org.example;

import java.awt.*;
import java.awt.event.KeyEvent;

public interface IPaddle {
    void keyPressed(KeyEvent e);

    void keyReleased(KeyEvent e);

    void setYDirection(int yDirection);

    void move();

    void draw(Graphics g);
}
