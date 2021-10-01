package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;
        System.out.println("Type 1 if you want to see the rectangle test, type 2 if you want to see the circle test, type 3 if you want to see the triangle test.");
        Scanner in= new Scanner(System.in);
        a = (int) in.nextFloat();


        switch(a){
            case 1: //rectangle
                ArrayList<Point> cooRectangle = new ArrayList<Point>();

                cooRectangle.add( new Point(0, 4));
                cooRectangle.add( new Point(6, 4));
                cooRectangle.add( new Point(6, 0));
                cooRectangle.add( new Point(0, 0));
                Rectangle rec = new Rectangle(cooRectangle);

                //rec.display();

                Point recCenter;
                recCenter = rec.getCenter();
                System.out.println("The center of the rectangle is: " + recCenter.getX() + ", "+ recCenter.getY() + "\n\n");

                rec.getArea();
                rec.getCirconference();

                rec.isPointInShape(new Point(2, 2));

                ArrayList<Point> cooRectangle2 = new ArrayList<Point>();
                cooRectangle2.add( new Point(0, 4));
                cooRectangle2.add( new Point(6, 4));
                cooRectangle2.add( new Point(6, 0));
                cooRectangle2.add( new Point(0, 0));
                Rectangle rec2 = new Rectangle(cooRectangle2);

                float d = rec.getEuclideanDistanceFrom(rec2);

                rec.moveShape();
                break;

            case 2: //circle
                Point ce = new Point(1,1);
                Circle c = new Circle(ce, 5);

                Point ce2 = new Point(4,4);
                Circle c2 = new Circle(ce2, 3);

                c.display();
                c.getArea();
                c.getCirconference();

                float d2 = c.getEuclideanDistanceFrom(c2);
                c.isPointInShape(ce2);

                c.moveShape();
                break;

            case 3: //triangle
                ArrayList<Point> cooTriangle = new ArrayList<Point>();


                cooTriangle.add( new Point(1, 4));
                cooTriangle.add( new Point(6, 4));
                cooTriangle.add( new Point(6, 0));
                Triangle tri;
                tri = new Triangle(cooTriangle);

                ArrayList<Point> cooTriangle2 = new ArrayList<Point>();

                cooTriangle2.add( new Point(3, 8));
                cooTriangle2.add( new Point(4, 4));
                cooTriangle2.add( new Point(3, 7));
                Triangle tri2 = new Triangle(cooTriangle2);

                Point center;
                center = tri.getCenter();

                tri.getArea();
                tri.getCirconference();

                tri.isPointInShape(new Point(3,4));
                float d3 = tri.getEuclideanDistanceFrom(tri2);

                tri.moveShape();
                break;

            default:
                System.out.println("A problem has been encountered. Please, type 1 if you want to see the rectangle test," +
                        " type 2 if you want to see the circle test, type 3 if you want to see the triangle test.");
                break;

        }

    }
}
