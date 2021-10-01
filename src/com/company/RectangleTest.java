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
    void getCenter() {
    }

    @Test
    void getArea() {
    }

    @Test
    void getCirconference() {
    }

    @Test
    void isPointInShape() {
    }

    @Test
    void moveShape() {
    }
}