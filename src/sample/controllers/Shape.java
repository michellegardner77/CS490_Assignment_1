package sample.controllers;

import javafx.scene.control.Alert;
import sample.Drawable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mgard on 6/16/2017.
 */
public abstract class Shape implements Drawable {

    protected double x;
    protected double y;

    // maybe have
    public static JFrame window = new JFrame("Shapes");


    public void draw(Graphics g) {
        // if shape is abstract, tell user this shape is abstract.
        try{
            // if shape is abstract run alert.
        }catch(Exception ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("This shape is abstract! Can't be Drawn! Try again!");
            alert.setHeaderText(null);
            alert.setContentText(ex.getMessage());
        }


    }
}

