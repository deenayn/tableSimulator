package com.deenayn.table.simulator;

import com.deenayn.table.simulator.enums.Move;
import com.deenayn.table.simulator.parser.Parser;
import com.deenayn.table.simulator.parser.system.dimensional.two.ConsoleTwoDimensionalSystemParser;
import com.deenayn.table.simulator.parser.system.dimensional.two.entity.TwoDimensionalSystemHeader;
import com.deenayn.table.simulator.system.dimensional.two.TwoDimensionalCoordinate;
import com.deenayn.table.simulator.system.dimensional.two.object.Point;
import com.deenayn.table.simulator.system.dimensional.two.table.RectangleTable;

public class Main {

    public static void main(String[] args) {
        try (Parser<TwoDimensionalSystemHeader> parser = new ConsoleTwoDimensionalSystemParser()) {
            System.out.println("Hello! Please input a header: ");

            TwoDimensionalSystemHeader header = parser.getHeader();
            RectangleTable table = new RectangleTable(header.getTableSizeX(), header.getTableSizeY());
            Point point = new Point(new TwoDimensionalCoordinate(header.getPointStartPositionX(), header.getPointStartPositionY()));
            Simulator<TwoDimensionalCoordinate> simulator = new Simulator<>(table, point);

            System.out.println("Now please input moves: ");
            Move move;
            while ((move = parser.getNextMove()) != Move.FINISH) {
                simulator.move(move);
            }
            System.out.println(simulator.getFinalObjectCoordinate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
