package com.deenayn.table.simulator.parser;

import com.deenayn.table.simulator.enums.Move;

import java.io.Closeable;

public interface Parser<T> extends Closeable {

    Move getNextMove();

    T getHeader();
}
