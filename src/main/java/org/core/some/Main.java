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
 *  dockerfile1
 * FROM bellsoft/liberica-openjdk-alpine:latest
 * COPY ./java ./src
 * RUN mkdir ./out
 * RUN javac -sourcepath ./src -d out src/org/core/some/Main.java
 * CMD java -classpath ./out org.core.some.Main
 *
 * dockerfile2
 * FROM bellsoft/liberica-openjdk-alpine:latest AS BuildProject1
 * WORKDIR /app
 * COPY ./java ./src
 * RUN mkdir ./out
 * RUN javac -sourcepath ./src -d out ./src/org/core/some/Main.java
 *
 * FROM scratch AS readyFiles
 * COPY --from=BuildProject1 /app/out /bin
 *
 * docker buildx build --output type=local,dest=. .
 *
 *
 *
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