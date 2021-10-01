package com.company;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void display() {
        //create a rectangle
        ArrayList<Point> cooRectangle = new ArrayList<Point>();

        cooRectangle.add( new Point(0, 4));
        cooRectangle.add( new Point(6, 4));
        cooRectangle.add( new Point(6, 0));
        cooRectangle.add( new Point(0, 0));
        Rectangle rec = new Rectangle(cooRectangle);


    }

    @Test
    byte getCenter() {
        //create a rectangle
        ArrayList<Point> cooRectangle = new ArrayList<Point>();

        cooRectangle.add( new Point(0, 4));
        cooRectangle.add( new Point(6, 4));
        cooRectangle.add( new Point(6, 0));
        cooRectangle.add( new Point(0, 0));
        Rectangle rec = new Rectangle(cooRectangle);

        int x = (0 + 6) / 2;
        int y= (4 + 0 / 2) ;

        assertEquals(new Point(x,y), getCenter());
        return 0;
    }

    @Test
    byte getArea() {
        //create a rectangle
        ArrayList<Point> cooRectangle = new ArrayList<Point>();

        cooRectangle.add( new Point(0, 4));
        cooRectangle.add( new Point(6, 4));
        cooRectangle.add( new Point(6, 0));
        cooRectangle.add( new Point(0, 0));
        Rectangle rec = new Rectangle(cooRectangle);

        assertEquals(24, getArea());
        return 0;
    }

    @Test
    byte getCirconference() {
        //create a rectangle
        ArrayList<Point> cooRectangle = new ArrayList<Point>();

        cooRectangle.add( new Point(0, 4));
        cooRectangle.add( new Point(6, 4));
        cooRectangle.add( new Point(6, 0));
        cooRectangle.add( new Point(0, 0));
        Rectangle rec = new Rectangle(cooRectangle);

        assertEquals(20, getCirconference());
        return 0;
    }

    @Test
    void isPointInShape() {
    }

    @Test
    void moveShape() {
    }
}