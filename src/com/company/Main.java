package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //We ask the user what they want to do and get their answer
        int a;
        System.out.println("Type 1 if you want to see the rectangle test, type 2 if you want to see the circle test, type 3 if you want to see the triangle test.");
        Scanner in= new Scanner(System.in);
        a = (int) in.nextFloat();

        //Depending on their choice
        switch (a) {
            case 1 -> {
                //Creation of the rectangle
                ArrayList<Point> cooRectangle = new ArrayList<Point>();
                cooRectangle.add(new Point(0, 4));
                cooRectangle.add(new Point(6, 4));
                cooRectangle.add(new Point(6, 0));
                cooRectangle.add(new Point(0, 0));
                Rectangle rec = new Rectangle(cooRectangle);

                //We get the center of the rectangle and print it out
                Point recCenter;
                recCenter = rec.getCenter();
                System.out.println("The center of the rectangle is: " + recCenter.getX() + ", " + recCenter.getY() + "\n\n");

                //We get the area and circonference of the rectangle
                rec.getArea();
                rec.getCirconference();

                //We check if this point is inside the rectangle
                rec.isPointInShape(new Point(2, 2));

                //creation of a second rectangle
                ArrayList<Point> cooRectangle2 = new ArrayList<Point>();
                cooRectangle2.add(new Point(0, 4));
                cooRectangle2.add(new Point(6, 4));
                cooRectangle2.add(new Point(6, 0));
                cooRectangle2.add(new Point(0, 0));
                Rectangle rec2 = new Rectangle(cooRectangle2);

                //we check the distance between the two rectangles
                float d = rec.getEuclideanDistanceFrom(rec2);

                //we move the rectangle
                rec.moveShape();
            }
            case 2 -> {
                //Creation of two circles
                Point ce = new Point(1, 1);
                Circle c = new Circle(ce, 5);
                Point ce2 = new Point(4, 4);
                Circle c2 = new Circle(ce2, 3);

                //we display the circle, get its area and circonference
                c.display();
                c.getArea();
                c.getCirconference();

                //we get the distance between the two circles
                float d2 = c.getEuclideanDistanceFrom(c2);

                //we check if the center of the second circle is inside the first one
                c.isPointInShape(ce2);

                //we move the circle
                c.moveShape();
            }
            case 3 -> {
                //Creation of two triangles
                ArrayList<Point> cooTriangle = new ArrayList<Point>();
                cooTriangle.add(new Point(1, 4));
                cooTriangle.add(new Point(6, 4));
                cooTriangle.add(new Point(6, 0));
                Triangle tri;
                tri = new Triangle(cooTriangle);
                ArrayList<Point> cooTriangle2 = new ArrayList<Point>();
                cooTriangle2.add(new Point(3, 8));
                cooTriangle2.add(new Point(4, 4));
                cooTriangle2.add(new Point(3, 7));
                Triangle tri2 = new Triangle(cooTriangle2);

                //we get the center of the triangle
                Point center;
                center = tri.getCenter();

                //We get its area and circonference
                tri.getArea();
                tri.getCirconference();

                //we check if the point is inside the triangle
                tri.isPointInShape(new Point(3, 4));

                //we check the distance between the two triangles
                float d3 = tri.getEuclideanDistanceFrom(tri2);

                //we move the triangle
                tri.moveShape();
            }
            default ->
                    //In case none of the options developed are called, we tell the user an error has happened
                    System.out.println("A problem has been encountered. Please, type 1 if you want to see the rectangle test," +
                            " type 2 if you want to see the circle test, type 3 if you want to see the triangle test.");
        }
    }
}
