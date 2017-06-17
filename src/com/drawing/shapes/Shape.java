package com.drawing.shapes;

import com.drawing.interfaces.Drawable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mgard on 6/16/2017.
 */
public abstract class Shape implements Drawable {

    // x location
    protected double x;
    // y location
    protected double y;

    public void draw(Graphics g) {
        // Shape is an abstract class. You shouldn't call the draw method directly but only from a subclass of Shape.

        // Throws error message to user.
        JOptionPane.showMessageDialog(null,
                "You cannot draw Class Shape, it is an abstract class.",
                "Invalid Operation",
                JOptionPane.ERROR_MESSAGE);
    }
}

