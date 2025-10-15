/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab6;

/*
    Written by 6237800
    Github: https://github.com/Merrick-Vanier/Programming3_Lab6
*/

import javafx.application.Application;
import javafx.event.EventType;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
public class Task1 extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        // Constants for the scene size
        final double SCENE_WIDTH = 520.0;
        final double SCENE_HEIGHT = 520.0;
        // Constants for each square's XY coordinates
        final int X1 = 10, Y1 = 10; // Square #1
        final int X2 = 60, Y2 = 60; // Square #1
        final int X3 = 110, Y3 = 110; // Square #3
        // Constants for each square's width and height
        final int WIDTH1 = 500, HEIGHT1 = 500; // Square #1
        final int WIDTH2 = 400, HEIGHT2 = 400; // Square #2
        final int WIDTH3 = 300, HEIGHT3 = 300; // Square #3
        // Constants for the circle's geometry
        final int CENTER_X = 260, CENTER_Y = 260, RADIUS = 150;
        // Create square #1 here. Set its stroke color to black and set its fill color to null.
        Rectangle sq1 = new Rectangle(WIDTH1, HEIGHT1);
        sq1.setX(X1);
        sq1.setY(Y1);
        sq1.setStroke(Color.BLACK);
        sq1.setFill(null);
        // Create square #2 here. Set its stroke color to black and set its fill color to null.
        Rectangle sq2 = new Rectangle(X2, Y2, WIDTH2, HEIGHT2);
        sq2.setStroke(Color.BLACK);
        sq2.setFill(null);

        // Create square #3 here. Set its stroke color to black and set its fill color to null.
        Rectangle sq3 = new Rectangle(X3, Y3, WIDTH3, HEIGHT3);
        sq3.setStroke(Color.BLACK);
        sq3.setFill(null);

        // Create the diagonal lines here.
        Line l1 = new Line(X1, Y1, X3, Y3);
        Line l2 = new Line(X1 + WIDTH1, Y1, X3 + WIDTH3, Y3);
        Line l3 = new Line(X1, Y1 + HEIGHT1, X3, Y3 + HEIGHT3);
        Line l4 = new Line(X1 + WIDTH1, Y1 + HEIGHT1, X3 + WIDTH3, Y3 + HEIGHT3);
        // Create the circle here.
        Circle c1 = new Circle(CENTER_X, CENTER_Y, 150);
        c1.setFill(Color.BLACK);
        // Add the nodes to a Pane here.
                Pane root = new Pane(sq1, sq2, sq3, l1, l2, l3, l4, c1);
        // Create a Scene with the Pane as the root node,
                Scene s = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
                primaryStage.setScene(s);
                primaryStage.show();
        // and display it here.

    }
}
