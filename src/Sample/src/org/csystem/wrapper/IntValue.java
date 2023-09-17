/*-------------------------------------------------------------
	FILE		: IntValue.java
	AUTHOR		: Java-Mar-2023 Group
	Last UPDATE	: 17th Sep 2023

	Immutable IntValue class that wraps an int value by
	using cache for [-128, 127]

	Copyleft (c) 1993 C and System Programmers Association
	All Right Free
-------------------------------------------------------------*/
package org.csystem.wrapper;

public class IntValue {
    private static final int CACHE_MIN_VALUE = -128;
    private static final int CACHE_MAX_VALUE = 127;
    private static final IntValue[] CACHE = new IntValue[CACHE_MAX_VALUE - CACHE_MIN_VALUE + 1];
    private final int m_value;

    private IntValue(int value)
    {
        m_value = value;
    }

    public static IntValue of(int value)
    {
        if (value < CACHE_MIN_VALUE || value > CACHE_MAX_VALUE)
            return new IntValue(value);

        if (CACHE[value - CACHE_MIN_VALUE] == null)
            CACHE[value - CACHE_MIN_VALUE] = new IntValue(value);

        return CACHE[value - CACHE_MIN_VALUE];
    }

    public int getValue()
    {
        return m_value;
    }

}
