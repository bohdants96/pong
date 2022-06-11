package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PongGame
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        GameFrame frame=context.getBean("GameFrame",GameFrame.class);
      //  GameFrame frame=new GameFrame();
    }
}
