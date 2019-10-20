package com.deenayn.table.simulator.enums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectionTest {

    @Test
    public void turnClockwiseNorth() {
        assertEquals(Direction.EAST, Direction.NORTH.turnClockwise());
    }

    @Test
    public void turnClockwiseEast() {
        assertEquals(Direction.SOUTH, Direction.EAST.turnClockwise());
    }

    @Test
    public void turnClockwiseSouth() {
        assertEquals(Direction.WEST, Direction.SOUTH.turnClockwise());
    }

    @Test
    public void turnClockwiseWest() {
        assertEquals(Direction.NORTH, Direction.WEST.turnClockwise());
    }

    @Test
    public void turnCounterclockwiseNorth() {
        assertEquals(Direction.WEST, Direction.NORTH.turnCounterclockwise());
    }

    @Test
    public void turnCounterclockwiseEast() {
        assertEquals(Direction.NORTH, Direction.EAST.turnCounterclockwise());
    }

    @Test
    public void turnCounterclockwiseSouth() {
        assertEquals(Direction.EAST, Direction.SOUTH.turnCounterclockwise());
    }

    @Test
    public void turnCounterclockwiseWest() {
        assertEquals(Direction.SOUTH, Direction.WEST.turnCounterclockwise());
    }
}