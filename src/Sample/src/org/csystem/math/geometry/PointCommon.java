/*-------------------------------------------------------------
	FILE		: PointCommon.java
	AUTHOR		: Java-Mar-2023 Group
	Last UPDATE	: 17th Sep 2023

    Utility friendly class for common operations of
    Point and MutablePoint classes

	Copyleft (c) 1993 C and System Programmers Association
	All Right Free
-------------------------------------------------------------*/
package org.csystem.math.geometry;

class PointCommon {
    private PointCommon()
    {
    }

    static double distance(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    static String toString(double x, double y)
    {
        return String.format("(%f, %f)", x, y);
    }
}
