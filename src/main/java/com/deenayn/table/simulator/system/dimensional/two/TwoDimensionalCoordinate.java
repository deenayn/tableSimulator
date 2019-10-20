package com.deenayn.table.simulator.system.dimensional.two;

import com.deenayn.table.simulator.system.dimensional.Coordinate;

public class TwoDimensionalCoordinate extends Coordinate {

    private short x;
    private short y;

    public TwoDimensionalCoordinate(Short x, Short y) {
        this.x = x;
        this.y = y;
    }

    public Short getX() {
        return x;
    }

    public Short getY() {
        return y;
    }

    public void addX(Short value) {
        x += value;
    }

    public void addY(Short value) {
        y += value;
    }

    public void subtractX(Short value) {
        x -= value;
    }

    public void subtractY(Short value) {
        y -= value;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
