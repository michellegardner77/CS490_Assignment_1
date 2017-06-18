package com.drawing.jframes;

import com.drawing.shapes.Ellipse;
import com.drawing.shapes.Rectangle;
import com.drawing.shapes.RoundedRectangle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mgard on 6/16/2017.
 */

// Class DrawingApplication is extending JFrame to be able to override the paint method
// and keep track of the drawables.
public class DrawingApplication extends JFrame {

    // JFrame Properties (ex. Labels, Panels, etc.)

    com.drawing.shapes.Shape[] shapeArray = {
        new Rectangle(10, 35, 105, 105),
        new Rectangle(30, 95, 200, 150),
        new Ellipse(50, 240, 300),
        new Ellipse(80, 30, 160),
        new RoundedRectangle(60, 50, 80, 60, 55, 19)

    };


    public DrawingApplication(String title) {
        // Set the JFrames (Frames) title
        super(title);
        // Set the JFrames size
        setSize(800, 500);
        // Tell the JFrame what to do on exit
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // TODO: pick right layout to draw graphics.
        setLayout(new BorderLayout());

        // Move JFrame starting position to middle of screen.
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        // TODO any other setup actions. Might not be any.
    }

    @Override
    public void paint(Graphics g) {

        for(int i = 0; i < shapeArray.length; i++){
            shapeArray[i].draw(g);
        }
    }

}
