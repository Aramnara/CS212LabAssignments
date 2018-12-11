package com.anthonyramnarain;

/*To create a JavaFX application that displays the pattern shown on
        P.44, programming project 6 in your textbook.
        • First import all the required classes from the textbook.
        • Write a static main method and launch the application.
        • Create a canvas and get the GraphicsContext object.
        • Create a new file and write data from the array to the file.
        • Write the drawing statements
        • Add the canvas to the root node.
        • Show the primary stage.
        • If the drawing isn’t what you expect, think where it went wrong.
        • You need to draw filled circle in the center, arouund it you need to
        draw an unfilled circle and the you have 4 open semicircles.
        • The fillOval() and the strokeOval methods are for the circles and the
        strokeArc method() lets you draw the semicircles.*/


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Lab17 extends Application {

    @Override
    public void start(Stage stage) {
        initUI(stage);
    }

    private void initUI(Stage stage) {
        Pane root = new Pane();

        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setStroke(Color.RED);
        gc.strokeOval(150, 150, 200, 200);

        gc.setFill(Color.BLUE);
        gc.fillOval(200, 200, 100, 100);

        root.getChildren().add(getArc(0, 250, 150, 130, -90, 180));
        root.getChildren().add(getArc(250, 0, 130, 150, -180, 180));
        root.getChildren().add(getArc(500, 250, 150, 130, 90, 180));
        root.getChildren().add(getArc(250, 500, 130, 150, 0, 180));
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 500, 500, Color.WHITESMOKE);

        stage.setTitle("Lines");
        stage.setScene(scene);
        stage.show();
    }

    public static Arc getArc(int centerX, int centerY, int xradius, int yradius, int startAngle, int length) {
        Arc arc = new Arc(centerX, centerY, xradius, yradius, startAngle, length);
        arc.setFill(Color.TRANSPARENT);
        arc.setStroke(Color.GREEN);
        arc.setType(ArcType.ROUND);
        return arc;
    }

    public static void main(String[] args) {
        launch(args);
    }
}