package com.deenayn.table.simulator.system.dimensional.two.table;

import com.deenayn.table.simulator.system.dimensional.two.TwoDimensionalCoordinate;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RectangleTableTest {

    @Test
    public void contains() {
        RectangleTable table = new RectangleTable((short) 4, (short) 4);
        assertTrue(table.contains(new TwoDimensionalCoordinate((short) 1, (short) 1)));
    }

    @Test
    public void containsNegative() {
        RectangleTable table = new RectangleTable((short) 4, (short) 4);
        assertFalse(table.contains(new TwoDimensionalCoordinate((short) 5, (short) 1)));
    }

    @Test
    public void between() {
        RectangleTable table = new RectangleTable((short) 4, (short) 4);
        assertTrue(table.between((short) 1, (short) 2, (short) 3));
    }

    @Test
    public void betweenNegative() {
        RectangleTable table = new RectangleTable((short) 4, (short) 4);
        assertFalse(table.between((short) 1, (short) 6, (short) 3));
    }
}