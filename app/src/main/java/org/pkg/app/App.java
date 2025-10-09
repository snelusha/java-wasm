package org.pkg.app;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Foo foo = new Foo();

        Point p = new Point(3, 4);

        foo.printPoint(p);
        foo.printPoint(Point.getZero());
    }
}
