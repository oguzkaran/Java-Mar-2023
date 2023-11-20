package org.csystem.tuple.test;

import org.csystem.tuple.Triple;
import org.csystem.util.console.Console;

import java.util.ArrayList;

public class TripleTest {
    public static void run()
    {
        ArrayList<Triple<Integer, Integer, String>> cities = new ArrayList<>();

        cities.add(Triple.of(34, 212, "İstanbul"));
        cities.add(Triple.of(35, 232, "İzmir"));
        cities.add(Triple.of(67, 372, "Zonguldak"));
        cities.add(Triple.of(6, 312, "Ankara"));

        for (Triple<Integer, Integer, String> city : cities)
            Console.writeLine(city);

        int index = cities.indexOf(new Triple<>(67, 372, "Zonguldak"));

        Console.writeLine("Index:%d", index);
    }

    public static void main(String[] args)
    {
        run();
    }
}
