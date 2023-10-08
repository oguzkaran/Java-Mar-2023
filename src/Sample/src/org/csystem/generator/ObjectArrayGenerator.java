package org.csystem.generator;

import org.csystem.math.geometry.Point;
import org.csystem.util.array.ArrayUtil;
import org.csystem.util.string.StringUtil;

import java.util.Random;

public class ObjectArrayGenerator {
    private final Random m_random = new Random();

    //String, Integer, Boolean, Double, Character, Point, int [], String []
    private Object createObject()
    {
        return switch (m_random.nextInt(8)) {
            case 0 -> StringUtil.generateRandomTextTR(m_random, m_random.nextInt(5, 11));
            case 1 -> m_random.nextInt(-128, 127);
            case 2 -> m_random.nextBoolean();
            case 3 -> (double) m_random.nextInt(-10, 10);
            case 4 -> (char)(m_random.nextInt(26) + (m_random.nextBoolean() ? 'A' : 'a'));
            case 5 -> Point.createCartesian(m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100));
            case 6 -> ArrayUtil.generateRandomArray(m_random, m_random.nextInt(5, 20), 0, 100);
            default -> StringUtil.generateRandomTextsTR(m_random, m_random.nextInt(5, 8), 5, 11);
        };
    }

    public Object [] createObjects(int count)
    {
        Object [] objects = new Object[count];

        for (int i = 0; i < count; ++i)
            objects[i] =  createObject();

        return objects;
    }
}
