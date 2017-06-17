package com.drawing.shapes;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Created by mgard on 6/16/2017.
 */
public class Ellipse extends Shape {
    private double height;
    private double width;

    // Constructor to the Ellipse class.
    public Ellipse(double center, double width, double height){
        // Setting the supper class (Shape) x and y properties
        // Since a Oval/Ellipse doesn't really have a starting point the center point works to build out the radius
        super.x = center;
        super.y = center;
        // Setting local properties
        this.height = height;
        this.width = width;
    }

    public void draw(Graphics g) {
        g.drawOval((int)super.x, (int)super.y, (int)this.width, (int)this.height);
    }
}
