package com.company;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    byte getCenter() {
        //create a circle
        Point ce = new Point(1,1);
        Circle c = new Circle(ce, 5);

        //check if the method returns the right point
        assertEquals(new Point(1,1), getCenter());
        return 0;
    }

    @Test
    byte getArea() {
        //create a circle
        Point ce = new Point(1,1);
        Circle c = new Circle(ce, 5);

        assertEquals(3.14, getArea());
        return 0;
    }

    @Test
    byte getCirconference() {
        //create a circle
        Point ce = new Point(1,1);
        Circle c = new Circle(ce, 5);

        assertEquals(6.28, getCirconference());
        return 0;
    }

    @Test
    void isPointInShape() {
        //create a circle
        Point ce = new Point(1,1);
        Circle c = new Circle(ce, 5);
    }

    @Test
    void display() {
        //create a circle
        Point ce = new Point(1,1);
        Circle c = new Circle(ce, 5);
    }

    @Test
    void moveShape() {
        //create a circle
        Point ce = new Point(1,1);
        Circle c = new Circle(ce, 5);
    }
}