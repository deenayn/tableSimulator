package com.deenayn.table.simulator.enums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveTest {

    @Test
    public void getByKnownIndex() {
        assertEquals(Move.ROTATE_CLOCKWISE, Move.getByIndex((byte) 3));
    }

    @Test
    public void getByUnknownIndex() {
        assertEquals(Move.UNKNOWN, Move.getByIndex((byte) -127));
    }
}