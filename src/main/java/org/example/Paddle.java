package org.example;

import java.awt.*;
import java.awt.event.*;

public class Paddle extends Rectangle implements IPaddle{
    int id;
    int yVelocity;
    int speed=10;
    Paddle(int x,int y,int PADDLE_WIDTH,int PADDLE_HEIGHT,int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
    }
    @Override
    public void keyPressed(KeyEvent e){
        switch (id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(-speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed);
                    move();
                }
                break;
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    setYDirection(-speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    setYDirection(speed);
                    move();
                }
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e){
        switch (id){
            case 1:
                if(e.getKeyCode()==KeyEvent.VK_W){
                    setYDirection(0);
                    move();
                }
                if(e.getKeyCode()==KeyEvent.VK_S){
                    setYDirection(0);
                    move();
                }
                break;
            case 2:
                if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                    setYDirection(0);
                    move();
                }
                if(e.getKeyCode()==KeyEvent.VK_LEFT){
                    setYDirection(0);
                    move();
                }
                break;
        }
    }
    @Override
    public void setYDirection(int yDirection){
        yVelocity=yDirection;
    }
    @Override
    public void move(){
        y=y+yVelocity;
    }
    @Override
    public void draw(Graphics g){
        if(id==1){
            g.setColor(Color.BLUE);
        }else {
            g.setColor(Color.RED);
        }
        g.fillRect(x,y,width,height);
    }

}
