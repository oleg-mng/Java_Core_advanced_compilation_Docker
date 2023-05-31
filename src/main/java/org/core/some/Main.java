package org.core.some;

import org.core.another.Decorator;
import org.core.another.Operation;

/**
 * javac -sourcepath ./java -d out java/org/core/some/Main.java
 *
 * java -classpath ./out org.core.some.Main
 *
 * docker build . -t myappwithdocker
 *  docker run myappwithdocker
 *
 *  dockerfile
 * FROM bellsoft/liberica-openjdk-alpine:latest
 * COPY ./java ./src
 * RUN mkdir ./out
 * RUN javac -sourcepath ./src -d out src/org/core/some/Main.java
 * CMD java -classpath ./out org.core.some.Main
 *
 */

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