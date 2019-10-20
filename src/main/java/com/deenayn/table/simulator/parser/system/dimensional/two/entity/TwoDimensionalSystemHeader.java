package com.deenayn.table.simulator.parser.system.dimensional.two.entity;

public class TwoDimensionalSystemHeader {

    private final Short tableSizeX;
    private final Short tableSizeY;
    private final Short pointStartPositionX;
    private final Short pointStartPositionY;

    public TwoDimensionalSystemHeader(Short tableSizeX, Short tableSizeY, Short pointStartPositionX, Short pointStartPositionY) {
        this.tableSizeX = tableSizeX;
        this.tableSizeY = tableSizeY;
        this.pointStartPositionX = pointStartPositionX;
        this.pointStartPositionY = pointStartPositionY;
    }

    public Short getTableSizeX() {
        return tableSizeX;
    }

    public Short getTableSizeY() {
        return tableSizeY;
    }

    public Short getPointStartPositionX() {
        return pointStartPositionX;
    }

    public Short getPointStartPositionY() {
        return pointStartPositionY;
    }
}
