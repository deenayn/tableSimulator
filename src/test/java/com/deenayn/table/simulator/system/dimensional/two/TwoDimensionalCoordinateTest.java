package com.deenayn.table.simulator.system.dimensional.two;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoDimensionalCoordinateTest {

    @Test
    public void addX() {
        Short x = 5;
        Short y = 4;
        TwoDimensionalCoordinate coordinate = new TwoDimensionalCoordinate(x, y);
        Short val = 2;
        coordinate.addX(val);
        assertEquals(new Short((short) (x + val)), coordinate.getX());
        assertEquals(y, coordinate.getY());
    }

    @Test
    public void addY() {
        Short x = 5;
        Short y = 4;
        TwoDimensionalCoordinate coordinate = new TwoDimensionalCoordinate(x, y);
        Short val = 2;
        coordinate.addY(val);
        assertEquals(new Short((short) (y + val)), coordinate.getY());
        assertEquals(x, coordinate.getX());
    }

    @Test
    public void subtractX() {
        Short x = 5;
        Short y = 4;
        TwoDimensionalCoordinate coordinate = new TwoDimensionalCoordinate(x, y);
        Short val = 2;
        coordinate.subtractX(val);
        assertEquals(new Short((short) (x - val)), coordinate.getX());
        assertEquals(y, coordinate.getY());
    }

    @Test
    public void subtractY() {
        Short x = 5;
        Short y = 4;
        TwoDimensionalCoordinate coordinate = new TwoDimensionalCoordinate(x, y);
        Short val = 2;
        coordinate.subtractY(val);
        assertEquals(new Short((short) (y - val)), coordinate.getY());
        assertEquals(x, coordinate.getX());
    }
}