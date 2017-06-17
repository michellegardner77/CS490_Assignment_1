package com.drawing.shapes;

import java.awt.*;

/**
 * Created by mgard on 6/16/2017.
 */
public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double x, double y, double height, double width){
        // Setting the supper class (Shape) x and y properties
        super.x = x;
        super.y = y;
        // Setting local properties
        this.height = height;
        this.width = width;
    }

    public void draw(Graphics g) {
        g.drawRect((int) super.x, (int) super.y, (int) this.width, (int) this.height);
    }
}
