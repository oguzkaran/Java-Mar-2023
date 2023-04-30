/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının trigonometrik işlem yapan metotları radyan ölçü birimi ile işlem yaparlar
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		double val = kb.nextDouble();
		
		System.out.printf("sin(%f) = %f%n", val, Math.sin(Math.toRadians(val)));	
	}
}

