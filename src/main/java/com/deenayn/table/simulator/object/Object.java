package com.deenayn.table.simulator.object;

import com.deenayn.table.simulator.enums.Move;
import com.deenayn.table.simulator.system.dimensional.Coordinate;

public abstract class Object<T extends Coordinate> {

    protected final T currentCoordinate;
    protected final T fallenCoordinate;
    protected boolean fallen = false;

    public Object(T currentCoordinate, T fallenCoordinate) {
        this.currentCoordinate = currentCoordinate;
        this.fallenCoordinate = fallenCoordinate;
    }

    public abstract void move(Move move);

    public T getCurrentCoordinate() {
        return currentCoordinate;
    }

    public T getFinalCoordinate() {
        return fallen ? fallenCoordinate : currentCoordinate;
    }

    public void fall() {
        fallen = true;
    }

    public boolean isFallen() {
        return fallen;
    }

    public T getFallenCoordinate() {
        return fallenCoordinate;
    }
}
