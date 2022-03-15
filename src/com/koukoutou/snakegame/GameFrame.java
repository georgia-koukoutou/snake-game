package com.koukoutou.snakegame;

import java.io.IOException;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    private static final long serialVersionUID = -5738804289526098897L;

    public GameFrame() throws IOException {

        add(new GamePanel());
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        // center frame to the screen
        setLocationRelativeTo(null);
    }

}
