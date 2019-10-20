package com.deenayn.table.simulator.enums;

import com.deenayn.table.simulator.exceptions.NoSuchImplementationException;

public enum Direction {

    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction turnClockwise() {
        switch (this) {
            case NORTH:
                return EAST;
            case EAST:
                return SOUTH;
            case SOUTH:
                return WEST;
            case WEST:
                return NORTH;
            default:
                throw new NoSuchImplementationException("No implementation of turning clockwise for direction: " + this.name());
        }
    }

    public Direction turnCounterclockwise() {
        switch (this) {
            case NORTH:
                return WEST;
            case EAST:
                return NORTH;
            case SOUTH:
                return EAST;
            case WEST:
                return SOUTH;
            default:
                throw new NoSuchImplementationException("No implementation of turning counterclockwise for direction: " + this.name());
        }
    }
}
