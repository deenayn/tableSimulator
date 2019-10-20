package com.deenayn.table.simulator.system.dimensional.two.object;

import com.deenayn.table.simulator.enums.Direction;
import com.deenayn.table.simulator.enums.Move;
import com.deenayn.table.simulator.exceptions.NoSuchImplementationException;
import com.deenayn.table.simulator.object.Object;
import com.deenayn.table.simulator.system.dimensional.two.TwoDimensionalCoordinate;

public class Point extends Object<TwoDimensionalCoordinate> {

    protected Direction direction = Direction.NORTH;
    private boolean finished = false;
    private short step = 1;

    public Point(TwoDimensionalCoordinate current) {
        super(current, new TwoDimensionalCoordinate((short) -1, (short) -1));
    }

    @Override
    public void move(Move move) {
        if (!finished && !fallen) {
            switch (move) {
                case FINISH: {
                    finished = true;
                    break;
                }
                case FORWARD: {
                    moveForward();
                    break;
                }
                case BACKWARD: {
                    moveBackward();
                    break;
                }
                case ROTATE_CLOCKWISE: {
                    direction = direction.turnClockwise();
                    break;
                }
                case ROTATE_COUNTERCLOCKWISE: {
                    direction = direction.turnCounterclockwise();
                    break;
                }
                default:
                    throw new NoSuchImplementationException("No such movement:" + move.name());
            }
        }
    }

    void moveForward() {
        switch (direction) {
            case NORTH: {
                currentCoordinate.subtractY(step);
                break;
            }
            case SOUTH: {
                currentCoordinate.addY(step);
                break;
            }
            case WEST: {
                currentCoordinate.subtractX(step);
                break;
            }
            case EAST: {
                currentCoordinate.addX(step);
                break;
            }
        }
    }

    void moveBackward() {
        switch (direction) {
            case NORTH: {
                currentCoordinate.addY(step);
                break;
            }
            case SOUTH: {
                currentCoordinate.subtractY(step);
                break;
            }
            case WEST: {
                currentCoordinate.addX(step);
                break;
            }
            case EAST: {
                currentCoordinate.subtractX(step);
                break;
            }
        }
    }
}
