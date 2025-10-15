/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * Written by 6237800
 * Github: https://github.com/Merrick-Vanier/Programming3_Lab6
 */
public class HouseWithWindowPanesLab extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        
        final int SceneX = 800;
        final int SceneY = 600;
        
        //Grass
        final int grassY = 500;
        final double grassHeight = 100; 
        Rectangle grass = new Rectangle(0, grassY, SceneX, grassHeight);
        grass.setFill(Color.GREEN);
        
        //House
        final int houseWidth = 300;
        final int houseX = 250;
        
        final int baseHeight = 20;
        final int baseY = 500;
        Rectangle base = new Rectangle(houseX, baseY, houseWidth, baseHeight);
        base.setFill(Color.BEIGE);
        
        final int wallHeight = 200;
        final int wallY = 300;
        Rectangle wall = new Rectangle(houseX, wallY, houseWidth, wallHeight);
        wall.setFill(Color.GRAY);
        wall.setStroke(Color.BLACK);
        wall.setStrokeWidth(2);

        final int doorWidth = 50;
        final int doorHeight  = 100;
        final int doorX = 400;
        final int doorY = 400;
        Rectangle door = new Rectangle(doorX, doorY, doorWidth, doorHeight);
        door.setFill(Color.BROWN);
        door.setStroke(Color.BLACK);
        door.setStrokeWidth(2);
        
        final int windowSide = 50;
        final int windowX1 = 300;
        final int windowY = 350;
        Rectangle window1 = new Rectangle(windowX1, windowY, windowSide, windowSide);
        window1.setFill(Color.AQUA);
        window1.setStroke(Color.BLACK);
        window1.setStrokeWidth(2);
        
        final int windowX2 = 475;
        Rectangle window2 = new Rectangle(windowX2, windowY, windowSide, windowSide);
        window2.setFill(Color.AQUA);
        window2.setStroke(Color.BLACK);
        window2.setStrokeWidth(2);
        
        Line l1 = new Line(windowX1, windowY + windowSide/2, windowX1 + windowSide, windowY + windowSide/2);
        l1.setFill(Color.BLACK);
        Line l2 = new Line(windowX1 + windowSide/2, windowY, windowX1 + windowSide/2, windowY + windowSide);
        l2.setFill(Color.BLACK);
        
        Line l3 = new Line(windowX2, windowY + windowSide/2, windowX2 + windowSide, windowY + windowSide/2);
        l3.setFill(Color.BLACK);
        Line l4 = new Line(windowX2 + windowSide/2, windowY, windowX2 + windowSide/2, windowY + windowSide);
        l4.setFill(Color.BLACK);
        
        final int midRoof = 400;
        final int roofHeight = 200;
        Polygon roof = new Polygon(houseX, wallY, midRoof, roofHeight, houseX + houseWidth, wallY);
        roof.setFill(Color.RED);
        roof.setStroke(Color.BLACK);
        roof.setStrokeWidth(2);
        
        final int chimneyWidth = 35;
        final int chimneyHeight = 90;
        final int chimneyX = 275;
        final int chimneyY = 230;
        Rectangle chimney = new Rectangle(chimneyX, chimneyY, chimneyWidth, chimneyHeight);
        chimney.setFill(Color.GREY);
        chimney.setStroke(Color.BLACK);
        chimney.setStrokeWidth(2);
        
        final int sunX = 700;
        final int sunY = 100;
        final int sunRadius = 50;
        Circle sun = new Circle(sunX, sunY, sunRadius);
        sun.setFill(Color.YELLOW);
        
        Pane root = new Pane(grass, base, chimney, wall, door, window1, window2, l1, l2, l3, l4, roof, sun);
        Scene s = new Scene(root, SceneX, SceneY);
        
        stage.setScene(s);
        stage.show();
    }
    
}


