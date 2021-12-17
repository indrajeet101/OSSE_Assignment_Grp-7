package com.DesignPatternsLearning.memento;

import java.awt.event.*;
import javax.swing.*;

public class TestMemento extends JFrame{

    public static void main(String[] args){
        new TestMemento();
    }

    private JButton saveBut, undo, redoBut;
    private JTextArea theArticle = new JTextArea(40,60);

    History history = new History();
    Editor editor = new Editor();

    int saveFiles = 0, currentArticle = 0;

    public TestMemento(){
        this.setSize(750,780);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT])
    }

}
