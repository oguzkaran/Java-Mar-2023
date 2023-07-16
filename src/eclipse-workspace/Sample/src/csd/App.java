/*----------------------------------------------------------------------------------------------------------------------	 
     
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		ComplexMultiplyWithComplexTest.run();		
	}
}

class ComplexMultiplyWithComplexTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random random = new java.util.Random();
		
		System.out.print("Input count:");
		int count = kb.nextInt();
		
		
		while (count-- > 0) {
			System.out.println("-------------------------------------------------------------------");
			Complex z1 = ComplexUtil.createRandomComplex(random, -10, 10);
			Complex z2 = ComplexUtil.createRandomComplex(random, -10, 10);
			
			z1.print();			
			z2.print();
			
			Complex z = z1.multiply(z2);
			
			z.print();
			
			System.out.println("-------------------------------------------------------------------");
		}
		
	}
}

class ComplexUtil {
	public static Complex createRandomComplex(java.util.Random random, double min, double bound)
	{
		return createRandomComplex(random, min, bound, min, bound);
	}
	
	public static Complex createRandomComplex(java.util.Random random, double minReal, double boundReal, double minImag, double boundImag)
	{
		return new Complex(random.nextDouble(minReal, boundReal), random.nextDouble(minImag, boundImag));
	}
}

class Complex {
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
	
	public void print()
	{
		System.out.printf("(%f, %f)%n", real, imag);
	}
}
