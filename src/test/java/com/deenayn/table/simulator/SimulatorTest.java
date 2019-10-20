package com.deenayn.table.simulator;

import com.deenayn.table.simulator.enums.Move;
import com.deenayn.table.simulator.object.Object;
import com.deenayn.table.simulator.system.dimensional.two.TwoDimensionalCoordinate;
import com.deenayn.table.simulator.system.dimensional.two.object.Point;
import com.deenayn.table.simulator.system.dimensional.two.table.RectangleTable;
import com.deenayn.table.simulator.table.Table;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimulatorTest {

    @Test
    public void move() {
        Table<TwoDimensionalCoordinate> table = new RectangleTable((short) 5, (short) 5);
        TwoDimensionalCoordinate startCoordinate = new TwoDimensionalCoordinate((short) 0, (short) 0);
        Object<TwoDimensionalCoordinate> point = new Point(startCoordinate);

        Simulator<TwoDimensionalCoordinate> simulator = new Simulator<>(table, point);
        simulator.move(Move.BACKWARD);
        simulator.move(Move.BACKWARD);
        assertEquals(point.getCurrentCoordinate(), simulator.getFinalObjectCoordinate());
    }

    @Test
    public void moveFall() {
        Table<TwoDimensionalCoordinate> table = new RectangleTable((short) 5, (short) 5);
        TwoDimensionalCoordinate startCoordinate = new TwoDimensionalCoordinate((short) 0, (short) 0);
        Object<TwoDimensionalCoordinate> point = new Point(startCoordinate);

        Simulator<TwoDimensionalCoordinate> simulator = new Simulator<>(table, point);
        simulator.move(Move.FORWARD);
        simulator.move(Move.FORWARD);
        assertEquals(point.getFallenCoordinate(), simulator.getFinalObjectCoordinate());
    }
}