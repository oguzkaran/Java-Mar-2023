/*----------------------------------------------------------------------------------------------------------------------	 
     
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		ComplexAddWithComplexTest.run();		
	}
}

class ComplexAddWithComplexTest {
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
			
			Complex z = z1.add(z2);
			
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
	
	public Complex add(Complex other)
	{
		
	}
	
	public void print()
	{
		System.out.printf("(%f, %f)%n", real, imag);
	}
}
