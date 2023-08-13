package org.csystem.util.numeric.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;
import static org.csystem.util.numeric.NumberUtil..*;

public class NumberUtilDigitsTest {
    public static void run()
    {
        Random random = new Random();
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        while (count-- > 0) {
            long val = random.nextLong();

            System.out.println("--------------------------------------------------------");
            System.out.printf("%d -> ", val);
            print(digits(val));
            System.out.println("--------------------------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
