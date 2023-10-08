package org.csystem.generator;

import org.csystem.math.geometry.Point;
import org.csystem.util.array.ArrayUtil;
import org.csystem.util.string.StringUtil;
import org.csystem.wrapper.IntValue;

import java.util.Random;

public class ObjectArrayGenerator {
    private final Random m_random = new Random();

    //String, IntValue, Point, int [], String []
    private Object createObject()
    {
        return switch (m_random.nextInt(5)) {
            case 0 -> StringUtil.generateRandomTextTR(m_random, m_random.nextInt(5, 11));
            case 1 -> IntValue.of(m_random.nextInt(-128, 127));
            case 2 -> Point.createCartesian(m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100));
            case 3 -> ArrayUtil.generateRandomArray(m_random, m_random.nextInt(5, 20), 0, 100);
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
