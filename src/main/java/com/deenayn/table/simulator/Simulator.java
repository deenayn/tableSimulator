package com.deenayn.table.simulator;

import com.deenayn.table.simulator.enums.Move;
import com.deenayn.table.simulator.object.Object;
import com.deenayn.table.simulator.system.dimensional.Coordinate;
import com.deenayn.table.simulator.table.Table;

class Simulator<T extends Coordinate> {

    private Table<T> table;
    private Object<T> object;

    Simulator(Table<T> table, Object<T> object) {
        this.table = table;
        this.object = object;
        if (!table.contains(object.getCurrentCoordinate())) {
            object.fall();
        }
    }

    void move(Move move) {
        object.move(move);
        if (!table.contains(object.getCurrentCoordinate())) {
            object.fall();
        }
    }

    T getFinalObjectCoordinate() {
        return object.getFinalCoordinate();
    }
}
