package com.deenayn.table.simulator.system.dimensional.two.object;

import com.deenayn.table.simulator.enums.Direction;
import com.deenayn.table.simulator.enums.Move;
import com.deenayn.table.simulator.system.dimensional.two.TwoDimensionalCoordinate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void move() {
        TwoDimensionalCoordinate startCoordinate = new TwoDimensionalCoordinate((short) 0, (short) 0);
        Point point = new Point(startCoordinate);
        point.move(Move.ROTATE_CLOCKWISE);
        point.move(Move.FORWARD);
        point.move(Move.ROTATE_COUNTERCLOCKWISE);
        point.move(Move.BACKWARD);
        assertEquals(new Short((short) 1), point.getCurrentCoordinate().getX());
        assertEquals(new Short((short) 1), point.getCurrentCoordinate().getY());
    }

    @Test
    public void moveFallen() {
        TwoDimensionalCoordinate startCoordinate = new TwoDimensionalCoordinate((short)0,(short)0);
        Point point = new Point(startCoordinate);
        point.move(Move.FORWARD);
        point.fall();
        point.move(Move.BACKWARD);
        assertEquals(new Short((short) -1), point.getFinalCoordinate().getX());
        assertEquals(new Short((short) -1), point.getFinalCoordinate().getY());
    }

    @Test
    public void moveFinished() {
        TwoDimensionalCoordinate startCoordinate = new TwoDimensionalCoordinate((short)0,(short)0);
        Point point = new Point(startCoordinate);
        point.move(Move.FORWARD);
        point.move(Move.FINISH);
        point.move(Move.BACKWARD);
        assertEquals(new Short((short) 0), point.getFinalCoordinate().getX());
        assertEquals(new Short((short) -1), point.getFinalCoordinate().getY());
    }

    @Test
    public void moveForwardNorth() {
        TwoDimensionalCoordinate startCoordinate = new TwoDimensionalCoordinate((short)0,(short)0);
        Point point = new Point(startCoordinate);
        point.direction = Direction.NORTH;
        point.move(Move.FORWARD);
        assertEquals(new Short((short) 0), point.getFinalCoordinate().getX());
        assertEquals(new Short((short) -1), point.getFinalCoordinate().getY());
    }

    @Test
    public void moveForwardSouth() {
        TwoDimensionalCoordinate startCoordinate = new TwoDimensionalCoordinate((short)0,(short)0);
        Point point = new Point(startCoordinate);
        point.direction = Direction.SOUTH;
        point.move(Move.FORWARD);
        assertEquals(new Short((short) 0), point.getFinalCoordinate().getX());
        assertEquals(new Short((short) 1), point.getFinalCoordinate().getY());
    }

    @Test
    public void moveForwardWest() {
        TwoDimensionalCoordinate startCoordinate = new TwoDimensionalCoordinate((short)0,(short)0);
        Point point = new Point(startCoordinate);
        point.direction = Direction.WEST;
        point.move(Move.FORWARD);
        assertEquals(new Short((short) -1), point.getFinalCoordinate().getX());
        assertEquals(new Short((short) 0), point.getFinalCoordinate().getY());
    }

    @Test
    public void moveForwardEast() {
        TwoDimensionalCoordinate startCoordinate = new TwoDimensionalCoordinate((short)0,(short)0);
        Point point = new Point(startCoordinate);
        point.direction = Direction.EAST;
        point.move(Move.FORWARD);
        assertEquals(new Short((short) 1), point.getFinalCoordinate().getX());
        assertEquals(new Short((short) 0), point.getFinalCoordinate().getY());
    }

    @Test
    public void moveBackwardNorth() {
        TwoDimensionalCoordinate startCoordinate = new TwoDimensionalCoordinate((short)0,(short)0);
        Point point = new Point(startCoordinate);
        point.direction = Direction.NORTH;
        point.move(Move.BACKWARD);
        assertEquals(new Short((short) 0), point.getFinalCoordinate().getX());
        assertEquals(new Short((short) 1), point.getFinalCoordinate().getY());
    }

    @Test
    public void moveBackwardSouth() {
        TwoDimensionalCoordinate startCoordinate = new TwoDimensionalCoordinate((short)0,(short)0);
        Point point = new Point(startCoordinate);
        point.direction = Direction.SOUTH;
        point.move(Move.BACKWARD);
        assertEquals(new Short((short) 0), point.getFinalCoordinate().getX());
        assertEquals(new Short((short) -1), point.getFinalCoordinate().getY());
    }

    @Test
    public void moveBackwardWest() {
        TwoDimensionalCoordinate startCoordinate = new TwoDimensionalCoordinate((short)0,(short)0);
        Point point = new Point(startCoordinate);
        point.direction = Direction.WEST;
        point.move(Move.BACKWARD);
        assertEquals(new Short((short) 1), point.getFinalCoordinate().getX());
        assertEquals(new Short((short) 0), point.getFinalCoordinate().getY());
    }

    @Test
    public void moveBackwardEast() {
        TwoDimensionalCoordinate startCoordinate = new TwoDimensionalCoordinate((short)0,(short)0);
        Point point = new Point(startCoordinate);
        point.direction = Direction.EAST;
        point.move(Move.BACKWARD);
        assertEquals(new Short((short) -1), point.getFinalCoordinate().getX());
        assertEquals(new Short((short) 0), point.getFinalCoordinate().getY());
    }
}