package org.pkg.app;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSClass;

@JSClass
public class Foo {
    @JSBody(params = { "p" }, script = "console.log(p);")
    public static native void printPoint(Point p);
}
