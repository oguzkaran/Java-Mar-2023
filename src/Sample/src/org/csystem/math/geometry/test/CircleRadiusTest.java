package org.csystem.math.geometry.test;

import org.csystem.math.geometry.Circle;

import java.util.Random;

public class CircleRadiusTest {
    public static void run()
    {
        Random random = new Random();

        while (true) {
            double radius = random.nextDouble(-5.56, 6);
            Circle c = new Circle(radius);

            System.out.printf("Generated radius:%f, Circle:%s%n", radius, c.toString());

            if (Math.abs(radius) <= 0.001)
                break;
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
