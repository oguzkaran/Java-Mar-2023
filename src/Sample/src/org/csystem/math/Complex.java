/*-------------------------------------------------------------
	FILE		: Complex.java
	AUTHOR		: Java-Mar-2023 Group
	Last UPDATE	: 06th Aug 2023
	
	Complex class that represents a complex number
	
	Copyleft (c) 1993 C and System Programmers Association
	All Right Free
-------------------------------------------------------------*/
package org.csystem.math;

public class Complex {
	public double real;
	public double imag;
	
	public static Complex add(double a1, double b1, double a2, double b2)
	{
		return new Complex(a1 + a2, b1 + b2);
	}
	
	public static Complex subtract(double a1, double b1, double a2, double b2)
	{
		return add(a1, b1, -a2, -b2);
	}
	
	public static Complex multiply(double a1, double b1, double a2, double b2)
	{
		return new Complex(a1 * a2 - b1 * b2, a1 * b2 + a2 * b1);
	}
	
	public Complex()
	{
	}
	
	public Complex(double re)
	{
		real = re;		
	}
	
	public Complex(double re, double im)
	{
		real = re;
		imag = im;
	}
	
	public double getLength()
	{
		return Math.sqrt(real * real + imag * imag);
	}
	
	public double getNorm()
	{
		return getLength();
	}
	
	public Complex getConjugate()
	{
		return new Complex(real, -imag);
	}
	
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.real, z.imag);
	}
	
	public Complex add(double val)
	{
		return add(real, imag, val, 0);
	}
	
	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}
	
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.real, z.imag);
	}
	
	public Complex subtract(double val)
	{
		return subtract(real, imag, val, 0);
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}
	
	public static Complex multiply(double val, Complex z)
	{
		return multiply(val, 0, z.real, z.imag);
	}
	
	public Complex multiply(double val)
	{
		return multiply(real, imag, val, 0);
	}
	
	public Complex multiply(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}
	
	public void inc()
	{
		inc(1);
	}
	
	public void inc(double val)
	{
		real += val;
	}
	
	public void dec(double val)
	{
		inc(-val);
	}
	
	public void dec()
	{
		dec(1);
	}
	
	public boolean isEquals(Complex other)
	{
		double DELTA = 0.000001;
		
		return Math.abs(real - other.real) < DELTA && Math.abs(imag - other.imag) < DELTA;
	}
	
	public String toString()
	{
		return String.format("(%f, %f)", real, imag);
	}
}
