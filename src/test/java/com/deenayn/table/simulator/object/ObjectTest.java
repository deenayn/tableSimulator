package com.deenayn.table.simulator.object;

import com.deenayn.table.simulator.enums.Move;
import com.deenayn.table.simulator.system.dimensional.two.TwoDimensionalCoordinate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ObjectTest {

    @Test
    public void fall() {
        TwoDimensionalCoordinate mockCoordinate = new TwoDimensionalCoordinate((short) -1, (short) -1);
        Object<TwoDimensionalCoordinate> object = new Object<TwoDimensionalCoordinate>(mockCoordinate, mockCoordinate) {
            @Override
            public void move(Move move) {
            }
        };
        object.fall();
        assertTrue(object.fallen);
    }

    @Test
    public void getFinalCoordinateForFallen() {
        TwoDimensionalCoordinate currentCoordinate = new TwoDimensionalCoordinate((short) 0, (short) 0);
        TwoDimensionalCoordinate fallenCoordinate = new TwoDimensionalCoordinate((short) -1, (short) -1);
        Object<TwoDimensionalCoordinate> object = new Object<TwoDimensionalCoordinate>(currentCoordinate, fallenCoordinate) {
            @Override
            public void move(Move move) {
            }
        };
        object.fall();
        assertEquals(fallenCoordinate, object.getFinalCoordinate());
    }

    @Test
    public void getFinalCoordinateForNotFallen() {
        TwoDimensionalCoordinate currentCoordinate = new TwoDimensionalCoordinate((short) 0, (short) 0);
        TwoDimensionalCoordinate fallenCoordinate = new TwoDimensionalCoordinate((short) -1, (short) -1);
        Object<TwoDimensionalCoordinate> object = new Object<TwoDimensionalCoordinate>(currentCoordinate, fallenCoordinate) {
            @Override
            public void move(Move move) {
            }
        };
        assertEquals(currentCoordinate, object.getFinalCoordinate());
    }
}