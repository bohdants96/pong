package org.example;

import java.awt.*;
import java.util.*;

public class Ball extends Rectangle implements IBall{
    Random random;
    int xVelocity;
    int yVelocity;
    private int speedBall=3;
    int nSpeed;

    Ball(int x,int y,int width,int height){
        super(x,y,width,height);
        random=new Random();
        nSpeed=getSpeedBall();
        int randomXDirection= random.nextInt(2);
        if(randomXDirection==0)
            randomXDirection--;
        setXDirection(randomXDirection*nSpeed);

        int randomYDirection= random.nextInt(2);
        if(randomYDirection==0)
            randomYDirection--;
        setYDirection(randomYDirection*nSpeed);
    }
    @Override
     public void setXDirection(int randomXDirection){
        xVelocity=randomXDirection;
     }
     @Override
    public void setYDirection(int randomYDirection){
        yVelocity=randomYDirection;
    }


    @Override
    public void move(){
        x+=xVelocity;
        y+=yVelocity;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(x,y,width,height);
    }
    @Override
    public int getSpeedBall(){
        return speedBall;
    }

}
