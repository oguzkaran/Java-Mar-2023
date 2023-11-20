package org.csystem.tuple.test;

import org.csystem.tuple.Pair;
import org.csystem.util.console.Console;

import java.util.ArrayList;

public class PairOfMethodTest {
    public static void run()
    {
        ArrayList<Pair<Integer, String>> cities = new ArrayList<>();

        cities.add(Pair.of(34, "İstanbul"));
        cities.add(Pair.of(35, "İzmir"));
        cities.add(Pair.of(67, "Zonguldak"));
        cities.add(Pair.of(6, "Ankara"));

        for (Pair<Integer, String> city : cities)
            Console.writeLine(city);

        int index = cities.indexOf(Pair.of(67, "Zonguldak"));

        Console.writeLine("Index:%d", index);
    }

    public static void main(String[] args)
    {
        run();
    }
}
