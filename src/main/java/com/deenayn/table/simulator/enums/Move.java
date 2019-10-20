package com.deenayn.table.simulator.enums;

public enum Move {

    FINISH((byte) 0),
    FORWARD((byte) 1),
    BACKWARD((byte) 2),
    ROTATE_CLOCKWISE((byte) 3),
    ROTATE_COUNTERCLOCKWISE((byte) 4),
    UNKNOWN;

    private byte index = -1;

    Move() {
    }

    Move(byte index) {
        this.index = index;
    }

    public static Move getByIndex(byte index) {
        for (Move move : Move.values()) {
            if (index == move.index) {
                return move;
            }
        }
        return UNKNOWN;
    }
}
