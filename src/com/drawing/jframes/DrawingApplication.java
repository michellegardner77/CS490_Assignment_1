package com.drawing.jframes;

import com.drawing.shapes.Ellipse;
import com.drawing.shapes.Rectangle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mgard on 6/16/2017.
 */

// Class DrawingApplication is extending JFrame to be able to override the paint method
// and keep track of the drawables.
public class DrawingApplication extends JFrame {

    // JFrame Properties (ex. Labels, Panels, etc.)

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

    // keeps track of a collection of drawables
//        List drawableList = new List();

    @Override
    public void paint(Graphics g) {
        System.out.println("PAINT CALLED");

        // Created custom rectangle object passing it x,y,height,and width.
        // calling custom implementation of draw which wil draw the rectangle on the JFrame.
        // must pass the draw method the local Graphics variable
        com.drawing.shapes.Rectangle rec = new Rectangle(10, 35, 105, 105);
        rec.draw(g);


        // Created custom ellipse object passing it center point, height,and width.
        // calling custom implementation of draw which will draw the ellipse (oval) on the JFrame.
        // must pass the draw method the local Graphics variable
        com.drawing.shapes.Ellipse ellipse = new Ellipse(50, 40, 100);
        ellipse.draw(g);

        // TODO: deal with multiple shapes stacking. Possibly put each shape in a JPanel and disallow stacking so they are placed next to each other based on the JFrame layout.

        // TODO: create collection of custom Drawables and then print them out instead of hardcoding them above. (do this using a loop over the collection)
    }

}
