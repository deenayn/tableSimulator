package com.deenayn.table.simulator.table;

import com.deenayn.table.simulator.system.dimensional.Coordinate;

public abstract class Table<T extends Coordinate> {

    public abstract boolean contains(T coordinate);
}
