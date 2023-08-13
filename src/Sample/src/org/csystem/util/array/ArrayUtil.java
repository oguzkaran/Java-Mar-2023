/*-------------------------------------------------------------
	FILE		: ArrayUtil.java
	AUTHOR		: Java-Mar-2023 Group
	Last UPDATE	: 13th Aug 2023

	Utility class for array operations

	Copyleft (c) 1993 C and System Programmers Association
	All Right Free
-------------------------------------------------------------*/
package org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {
    public static void fillRandomArray(Random random, int [] a, int min, int bound)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(min, bound);
    }

    public static int [] generateRandomArray(Random random, int count, int min, int bound)
    {
        int [] a = new int[count];

        fillRandomArray(random, a, min, bound);

        return a;
    }

    public static int max(int [] a)
    {
        //TODO:
    }

    public static int min(int [] a)
    {
        //TODO:
    }

    public static void print(int n, int [] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for (int i = 0; i < a.length; ++i)
            System.out.printf(fmt, a[i]);

        System.out.println();
    }

    public static void print(int [] a)
    {
        print(a, ' ', '\n');
    }

    public static void print(int [] a, char sep, char end)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d%c", a[i], sep);

        System.out.print(end);
    }

    public static void print(double [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%f%n", a[i]);
    }
}
