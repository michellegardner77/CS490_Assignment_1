package com.drawing.jframes;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mgard on 6/16/2017.
 */

// Class DrawingApplication is extending JFrame to be able to override the paint method
// and keep track of the drawables.
public class DrawingApplication extends JFrame{

        // JFrame Properties (ex. Labels, Panels, etc.)

        public DrawingApplication(String title){
                // Set the JFrames (Frames) title
                super(title);
                // Set the JFrames size
                setSize(800,500);
                // Tell the JFrame what to do on exit
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                // TODO: pick right layout to draw graphics.
//                setLayout();

                // Move JFrame starting position to middle of screen.
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

                // TODO any other setup actions. Might not be any.
        }

        // keeps track of a collection of drawables
//        List drawableList = new List();

        @Override
        public void paint(Graphics g) {
            // TODO: Implement method
        }

}
