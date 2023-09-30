/*-------------------------------------------------------------
	FILE		: AnalyticalCircle.java
	AUTHOR		: Java-Mar-2023 Group
	Last UPDATE	: 30th Sep 2023

	AnalyticalCircle class that represents a circle
	in cartesian plane

	Copyleft (c) 1993 C and System Programmers Association
	All Right Free
-------------------------------------------------------------*/
package com.egekucuk.math.geometry;

import org.csystem.math.geometry.Circle;
import org.csystem.math.geometry.MutablePoint;

public class AnalyticalCircle extends Circle {
    private final MutablePoint m_center;

    public AnalyticalCircle()
    {
        this(0);
    }

    public AnalyticalCircle(double radius)
    {
        this(radius, 0, 0);
    }

    public AnalyticalCircle(double x, double y)
    {
        this(0, x, y);
    }

    public AnalyticalCircle(double radius, double x, double y)
    {
        super(radius);
        m_center = MutablePoint.createCartesian(x, y);
    }

    public double getCenterX()
    {
        return m_center.getX();
    }

    public double getCenterY()
    {
        return m_center.getY();
    }

    public void setCenterX(double x)
    {
        m_center.setX(x);
    }

    public void setCenterY(double y)
    {
        m_center.setY(y);
    }

    public void setCenter(double x, double y)
    {
        setCenterX(x);
        setCenterY(y);
    }

    //...
}
