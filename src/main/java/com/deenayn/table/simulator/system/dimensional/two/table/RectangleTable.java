package com.deenayn.table.simulator.system.dimensional.two.table;

import com.deenayn.table.simulator.system.dimensional.two.TwoDimensionalCoordinate;
import com.deenayn.table.simulator.table.Table;

public class RectangleTable extends Table<TwoDimensionalCoordinate> {

    private final Short maxSizeX;
    private final Short maxSizeY;

    public RectangleTable(Short maxSizeX, Short maxSizeY) {
        this.maxSizeX = maxSizeX;
        this.maxSizeY = maxSizeY;
    }

    public Short getMaxSizeX() {
        return maxSizeX;
    }

    public Short getMaxSizeY() {
        return maxSizeY;
    }

    @Override
    public boolean contains(TwoDimensionalCoordinate coordinate) {
        Short minSizeX = 0;
        Short minSizeY = 0;
        return between(minSizeX, coordinate.getX(), maxSizeX) && between(minSizeY, coordinate.getY(), maxSizeY);
    }

    boolean between(Short minSize, Short val, Short maxSize) {
        return minSize <= val && val <= maxSize;
    }
}
