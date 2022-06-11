package org.example;

import java.awt.*;

public interface IBall {

    void setXDirection(int randomXDirection);

    void setYDirection(int randomYDirection);

    void move();

    void draw(Graphics g);

    int getSpeedBall();
}
