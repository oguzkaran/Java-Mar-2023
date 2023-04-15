/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği çalıştırarak yuvarlama hatalarını gözlemleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		double a = 0.1, b = 0.2;
		double c;
		
		c = a + b;
		
		System.out.printf("a = %.20f%n", a);
		System.out.printf("b = %.20f%n", b);
		System.out.printf("c = %.20f%n", c);
		
    }
}

