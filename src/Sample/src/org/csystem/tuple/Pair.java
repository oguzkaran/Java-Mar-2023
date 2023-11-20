/*----------------------------------------------------------------
	FILE		: Pair.java
	AUTHOR		: Java-Mar-2022 Group
	LAST UPDATE	: 20th Nov 2023

    Pair class that represents a tuple

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.tuple;

public class Pair<F, S> {
    public final F first;
    public final S second;

    public static <F, S> Pair<F, S> of(F first, S second)
    {
        return new Pair<>(first, second);
    }

    public Pair(F first, S second)
    {
        this.first = first;
        this.second = second;
    }

    public boolean equals(Object other)
    {
        return other instanceof Pair<?, ?> p && first.equals(p.first) && second.equals(p.second);
    }

    public String toString()
    {
        return String.format("(%s, %s)", first, second);
    }

    //...
}
