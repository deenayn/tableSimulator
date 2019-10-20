package com.deenayn.table.simulator.parser.system.dimensional.two;

import com.deenayn.table.simulator.enums.Move;
import com.deenayn.table.simulator.parser.system.dimensional.two.entity.TwoDimensionalSystemHeader;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class ConsoleTwoDimensionalSystemParserTest {

    @Test
    public void getHeader() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("4, 4, 0,0".getBytes()));

            ConsoleTwoDimensionalSystemParser parser = new ConsoleTwoDimensionalSystemParser();
            TwoDimensionalSystemHeader header = parser.getHeader();
            assertEquals(new Short((short) 4), header.getTableSizeX());
            assertEquals(new Short((short) 4), header.getTableSizeY());
            assertEquals(new Short((short) 0), header.getPointStartPositionX());
            assertEquals(new Short((short) 0), header.getPointStartPositionY());
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void getNextMove() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("1, 2, 4,0".getBytes()));

            ConsoleTwoDimensionalSystemParser parser = new ConsoleTwoDimensionalSystemParser();
            assertEquals(parser.getNextMove(), Move.getByIndex((byte) 1));
            assertEquals(parser.getNextMove(), Move.getByIndex((byte) 2));
            assertEquals(parser.getNextMove(), Move.getByIndex((byte) 4));
            assertEquals(parser.getNextMove(), Move.getByIndex((byte) 0));
        } finally {
            System.setIn(stdin);
        }
    }
}