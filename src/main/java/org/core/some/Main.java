package org.core.some;

import org.core.another.Decorator;
import org.core.another.Operation;

public class Main {
    public static void main(String[] args) {
        var res = Operation.add(2, 3);
        System.out.println(Decorator.decorate(res));
        res = Operation.sub(2, 3);
        System.out.println(Decorator.decorate(res));
        res = Operation.mul(2, 3);
        System.out.println(Decorator.decorate(res));
        res = Operation.div(2, 3);
        System.out.println(Decorator.decorate(res));

    }
}