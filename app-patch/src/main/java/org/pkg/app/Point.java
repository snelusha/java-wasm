package org.pkg.app;

import org.teavm.jso.JSProperty;
import org.teavm.jso.JSExport;

public class Point {
    private int x;
    private int y;

    @JSExport
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @JSExport
    @JSProperty
    public int getX() {
        return x;
    }

    @JSExport
    @JSProperty
    public int getY() {
        return y;
    }

    @JSExport
    public static Point getZero() {
        System.out.println("Point.getZero() called");
        return new Point(10, 10);
    }
}
