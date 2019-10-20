package com.deenayn.table.simulator.parser.system.dimensional.two;

import com.deenayn.table.simulator.enums.Move;
import com.deenayn.table.simulator.exceptions.ParseException;
import com.deenayn.table.simulator.parser.system.dimensional.two.entity.TwoDimensionalSystemHeader;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class ConsoleTwoDimensionalSystemParser extends AbstractTwoDimensionalSystemParser {

    private final Scanner scanner = new Scanner(System.in, "UTF-8").useDelimiter(", |,|\n|\r|\r\n|\n\r|\\s|");
    private TwoDimensionalSystemHeader header;

    @Override
    public TwoDimensionalSystemHeader getHeader() {
        try {
            if (header == null) {
                Short tableSizeX = scanner.nextShort();
                Short tableSizeY = scanner.nextShort();
                Short pointStartPositionX = scanner.nextShort();
                Short pointStartPositionY = scanner.nextShort();
                header = new TwoDimensionalSystemHeader(tableSizeX, tableSizeY, pointStartPositionX, pointStartPositionY);
            }
            return header;

        } catch (Exception e) {
            throw new ParseException("An error occurred while parsing the header using the scanner", e);
        }
    }

    @Override
    public Move getNextMove() {
        try {
            byte value = scanner.nextByte();
            Move move = Move.getByIndex(value);
            if (move == Move.UNKNOWN) {
                throw new InvalidParameterException("An invalid move: " + value);
            }
            return move;
        } catch (Exception e) {
            throw new ParseException("An error occurred while parsing the movements using the scanner", e);
        }
    }

    @Override
    public void close() {
        scanner.close();
    }
}
