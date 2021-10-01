package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Shape {


    abstract void display();
    abstract Point getCenter();
    abstract void getArea();
    abstract void getCirconference();
    abstract void isPointInShape(Point p);
    abstract void moveShape();

    float getEuclideanDistanceFrom(Shape shape) {
        Point center1 = this.getCenter();
        Point center2 = shape.getCenter();

        float d = (float) Math.sqrt((center2.getX() - center1.getX()) * (center2.getX() - center1.getX()));
        System.out.println("The euclidean distance between these two shapes is : " + d + "\n\n");

        return d;
    }
}

class Rectangle extends Shape {
    private ArrayList<Point> angles;
    private float length, width;


    public Rectangle(ArrayList<Point> angles) {
        this.angles = angles;

        if (angles.get(0).x - angles.get(1).x != 0) {
            if (angles.get(0).x > angles.get(1).x) {
                this.length = angles.get(0).x - angles.get(1).x;
            } else if (angles.get(1).x > angles.get(0).x) {
                this.length = angles.get(1).x - angles.get(0).x;
            }
        }

        if (angles.get(0).y - angles.get(3).y != 0) {
            if (angles.get(0).y > angles.get(3).y) {
                this.width = angles.get(0).y - angles.get(3).y;
            } else if (angles.get(3).y > angles.get(0).y) {
                this.width = angles.get(3).y - angles.get(0).y;
            }
        }

    }

    //To display the informations of the rectangle
    void display() {
        System.out.println("Here are the points of the rectangle:\n" );
        for(int i = 0; i <= 3; i++){
            System.out.println("x = " + this.angles.get(i).getX() + ", y = " + this.angles.get(i).getY() + "\n");
        }
        System.out.println("And the lenght: " + this.length + "\n" + "And the width: " + this.width);
    }

    //To get the center of the rectangle
    Point getCenter() {
        Point p = new Point();

        p.setLocation((this.angles.get(0).x + this.angles.get(1).x) / 2, (this.angles.get(0).y + this.angles.get(3).y) / 2);

        return p;
    }

    //To get the area of the rectangle
    void getArea() {
        float area;
        area = this.length * this.width;
        System.out.println("Here is the area of the rectangle: " + area + "\n\n");
    }

    //To get the circonference of the rectangle
    void getCirconference() {
        float circonference;
        circonference = (2 * this.width) + (2 * this.length);
        System.out.println("Here is the circonference of the rectangle: " + circonference + "\n\n");
    }

    //To know if a given point is inside the rectangle or not
    void isPointInShape(Point p) {

        if (p.getX() > this.angles.get(0).x && p.getX() < this.angles.get(1).x) {

            if (p.getY() < this.angles.get(0).y && p.getX() > this.angles.get(3).y) {
                System.out.println("The point given is inside the Rectangle. \n\n");
            }
        } else {
            System.out.println("The point given is NOT inside the Rectangle. \n\n");
        }
    }

    //To move the rectangle to another location
    void moveShape(){
        System.out.println("To move this rectangle, give me the new coordinates of the top left point. For x: ");
        float a,b;
        Scanner in= new Scanner(System.in);
        a = in.nextFloat();
        System.out.println("and for y: ");
        Scanner in2= new Scanner(System.in);
        b = in2.nextFloat();
        System.out.println("\n");

        this.angles.get(0).setLocation(a,b); //we set the first point to its new location

        //we move every angle to its new location while respecting the size of the original rectangle
        this.angles.get(1).setLocation(this.angles.get(0).getX() + this.length, this.angles.get(0).getY());
        this.angles.get(2).setLocation(this.angles.get(1).getX() , this.angles.get(1).getY() - this.width);
        this.angles.get(3).setLocation(this.angles.get(0).getX(), this.angles.get(0).getY() - this.width);

        //we display the result
        System.out.println("The rectangle is now like this: ");
        this.display();
    }
}


class Circle extends Shape{
    private Point center;
    private float radius;

    public Circle(Point center, float radius){
        this.center = center;
        this.radius = radius;
    }

    Point getCenter(){
        return this.center;
    }

    //To get the area of the circle
    void getArea(){
        float area = (float) Math.PI * this.radius * this.radius;
        System.out.println("area of circle: " + area + "\n");
    }

    //To get the circonference of the circle
    void getCirconference(){
        float circon = 2 * (float) Math.PI * this.radius;
        System.out.println("circonference of circle: " + circon + "\n");
    }

    //To know if a given point is inside the circle or not
    void isPointInShape(Point p){
        Point c = this.getCenter();

        float d = (float) Math.sqrt((p.getX() - c.getX()) * (p.getX() - c.getX()));
        if(d <= this.radius){
            System.out.println("The point given is inside the circle. \n\n");
        }else{
            System.out.println("The point given is not inside the circle. \n\n");
        }
    }

   //To display the informations about the circle
   void display(){
       System.out.println("The center of our circle is " + this.getCenter().getX() + ", " + this.getCenter().getY() + ".\n");
       System.out.println("And its radius is " + this.radius);
   }

   //To move the circle to another location
    void moveShape(){
        System.out.println("To move this circle, give me the new coordinates of the center. For x: ");
        float a,b;
        Scanner in= new Scanner(System.in);
        a = in.nextFloat();
        System.out.println("and for y: ");
        Scanner in2= new Scanner(System.in);
        b = in2.nextFloat();
        System.out.println("\n");

        this.center.setLocation(a,b);
        this.display();
    }
}


class Triangle extends Shape{
    private ArrayList<Point> angles;
    private float side1, side2, side3;

    public Triangle(ArrayList<Point> angles){
        this.angles = angles;

        this.side1 = (float) Math.abs(Math.sqrt((angles.get(1).getX() - angles.get(0).getX()) * (angles.get(1).getX() - angles.get(0).getX()) + (angles.get(1).getY() - angles.get(0).getY()) * (angles.get(1).getY() - angles.get(0).getY())));
        this.side2 = (float) Math.abs(Math.sqrt((angles.get(2).getX() - angles.get(1).getX()) * (angles.get(2).getX() - angles.get(1).getX()) + (angles.get(2).getY() - angles.get(1).getY()) * (angles.get(2).getY() - angles.get(1).getY())));
        this.side3 = (float) Math.abs(Math.sqrt((angles.get(2).getX() - angles.get(0).getX()) * (angles.get(2).getX() - angles.get(0).getX()) + (angles.get(2).getY() - angles.get(0).getY()) * (angles.get(2).getY() - angles.get(0).getY())));

    }

    Point getCenter(){
        Point p =new Point();

        float moyX = (float) ((float) angles.get(0).getX() + angles.get(1).getX() + angles.get(2).getX()) / 3;
        float moyY = (float) ((float) angles.get(0).getY() + angles.get(1).getY() + angles.get(2).getY()) / 3;

        p.setLocation(moyX, moyY);

        return p;
    }

    void getArea(){
        float area;
        float c = this.side1 + this.side2 + this.side3;

        area = c * (c - this.side1)* (c - this.side2)* (c - this.side3);

        System.out.println("The area of the triangle is " + area + ".\n\n");
    }

    void getCirconference(){

        float circon = this.side1 + this.side2 + this.side3;
        System.out.println("the circonference of the triangle is " + circon + ".\n\n");
    }

    void isPointInShape(Point p){

        double ABC = Math.abs (this.angles.get(0).getX() * (this.angles.get(1).getY() - this.angles.get(2).getY()) + this.angles.get(1).getX() * (this.angles.get(2).getY() - this.angles.get(0).getY()) + this.angles.get(2).getX() * (this.angles.get(0).getY() - this.angles.get(1).getY()));
        double ABP = Math.abs (this.angles.get(0).getX() * (this.angles.get(1).getY() - p.getY()) + this.angles.get(1).getX() * (p.getY() - this.angles.get(0).getY()) + p.getX() * (this.angles.get(0).getY() - this.angles.get(1).getY()));
        double APC = Math.abs (this.angles.get(0).getX() * (p.getY() - this.angles.get(2).getY()) + p.getX() * (this.angles.get(2).getY() - this.angles.get(0).getY()) + this.angles.get(2).getX() * (this.angles.get(0).getY() - p.getY()));
        double PBC = Math.abs (p.getX() * (this.angles.get(1).getY() - this.angles.get(2).getY()) + this.angles.get(1).getX() * (this.angles.get(2).getY() - p.getY()) + this.angles.get(2).getX() * (p.getY() - this.angles.get(1).getY()));

        boolean isInTriangle = ABP + APC + PBC == ABC;

        if(isInTriangle == true){
            System.out.println("The point given is inside the triangle.");
        }else{
            System.out.println("The point given is not inside the triangle.");
        }
    }

    @Override
    void display() {
        System.out.println("The three angles of this triangle are:\n");
        for(int i = 0; i <= 2; i++){
            System.out.println("x = " + this.angles.get(i).getX() + ", y = " + this.angles.get(i).getY() + "\n");
        }
        System.out.println("The lenghts of its sides are: " + this.side1 + ", " + this.side2 + ", " + this.side3 + ".\n\n");
    }

    //To move the triangle to another location
    void moveShape(){
        System.out.println("To move this triangle, give me the new coordinates for one of its angles. For x: ");
        float a,b;
        Scanner in= new Scanner(System.in);
        a = in.nextFloat();
        System.out.println("and for y: ");
        Scanner in2= new Scanner(System.in);
        b = in2.nextFloat();
        System.out.println("\n");

        //we save all the old coordinates
        Point old0;
        old0 = this.angles.get(0).getLocation();
        double x1, y1, x2, y2;
        x1 = this.angles.get(1).getX();
        y1 = this.angles.get(1).getY();
        x2 = this.angles.get(2).getX();
        y2 = this.angles.get(2).getY();

        //We set the new location of the first point
        this.angles.get(0).setLocation(a,b);

        //we set the new locations of the other points depending on the new coordinates of the first point
        if(a >= old0.x && b >= old0.y){
            this.angles.get(1).setLocation(x1 + (a - old0.x) , y1 + (b - old0.y));
            this.angles.get(2).setLocation(x2 + (a - old0.x) , y2 + (b - old0.y));

        } else if(a >= old0.x && b < old0.y){
            this.angles.get(1).setLocation(x1 + (a - old0.x) , y1 + (old0.y - b));
            this.angles.get(2).setLocation(x2 + (a - old0.x) , y2 + (old0.y - b));

        }else if(a < old0.x && b >= old0.y){
            this.angles.get(1).setLocation(x1 + (old0.x - a) , y1 + (b - old0.y));
            this.angles.get(2).setLocation(x2 + (old0.x - a) , y2 + (b - old0.y));

        }else if(a < old0.x && b < old0.y){
            this.angles.get(1).setLocation(x1 + (old0.x - a) , y1 + (old0.y - b));
            this.angles.get(2).setLocation(x2 + (old0.x - a) , y2 + (old0.y - b));

        }

        System.out.println("The triangle is now like this:\n");
        this.display();
    }
}
