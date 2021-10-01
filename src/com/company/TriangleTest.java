package com.company;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    byte getCenter() {
        ArrayList<Point> cooTriangle = new ArrayList<Point>();

        cooTriangle.add( new Point(1, 4));
        cooTriangle.add( new Point(6, 4));
        cooTriangle.add( new Point(6, 0));
        Triangle tri;
        tri = new Triangle(cooTriangle);

        assertEquals(new Point(4, 2), getCenter());
        return 0;
    }

    @Test
    byte getArea() {
        ArrayList<Point> cooTriangle = new ArrayList<Point>();

        cooTriangle.add( new Point(1, 4));
        cooTriangle.add( new Point(6, 4));
        cooTriangle.add( new Point(6, 0));
        Triangle tri;
        tri = new Triangle(cooTriangle);

        assertEquals(24, getArea());
        return 0;
    }

    @Test
    byte getCirconference() {
        ArrayList<Point> cooTriangle = new ArrayList<Point>();

        cooTriangle.add( new Point(0, 4));
        cooTriangle.add( new Point(6, 4));
        cooTriangle.add( new Point(6, 0));
        Triangle tri;
        tri = new Triangle(cooTriangle);

        assertEquals(13, getCirconference());
        return 0;
    }

    @Test
    void isPointInShape() {
    }

    @Test
    void display() {
    }

    @Test
    void moveShape() {
    }
}