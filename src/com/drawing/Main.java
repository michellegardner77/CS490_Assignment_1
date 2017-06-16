package com.drawing;


import com.drawing.jframes.DrawingApplication;

import javax.swing.*;

public class Main {

    // Create initial JFrame calling the constructor.
    private static JFrame drawingApplicationJFrame = new DrawingApplication("Drawing Application");

    public static void main(String[] args) {
        System.out.println("Application Started");
        drawingApplicationJFrame.setVisible(true);
    }
}
