package org.csystem.tuple.test;

import org.csystem.tuple.Pair;
import org.csystem.util.console.Console;

import java.util.ArrayList;

public class PairTest {
    public static void run()
    {
        ArrayList<Pair<Integer, String>> cities = new ArrayList<>();

        cities.add(new Pair<>(34, "İstanbul"));
        cities.add(new Pair<>(35, "İzmir"));
        cities.add(new Pair<>(67, "Zonguldak"));
        cities.add(new Pair<>(6, "Ankara"));

        for (Pair<Integer, String> city : cities)
            Console.writeLine(city);

        int index = cities.indexOf(new Pair<>(67, "Zonguldak"));

        Console.writeLine("Index:%d", index);
    }

    public static void main(String[] args)
    {
        run();
    }
}
