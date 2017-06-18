package com.drawing.shapes;

import java.awt.*;

/**
 * Created by mgard on 6/17/2017.
 */
public class RoundedRectangle extends Shape {

    private double height;
    private double width;
    private double arcWidth;
    private double arcHeight;


    public RoundedRectangle(double x, double y, double height, double width, double archWidth, double arcHeight){
        // Setting the supper class (Shape) x and y properties
        super.x = x;
        super.y = y;
        // Setting local properties
        this.height = height;
        this.width = width;

        this.arcWidth = archWidth;
        this.arcHeight = arcHeight;
    }

    public void draw(Graphics g) {
        g.drawRoundRect((int) super.x, (int) super.y, (int) this.width, (int) this.height, (int) this.arcWidth, (int) this.arcHeight) ;
    }

}


