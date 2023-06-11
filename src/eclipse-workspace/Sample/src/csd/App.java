/*----------------------------------------------------------------------------------------------------------------------	 
	Tür Dönüştürme Operatörü (Type Cast Operator):  
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("İki sayı giriniz:");
			int a = kb.nextInt();
			int b = kb.nextInt();
			double c;
			
			if (b == 0)
				break;			
			
			c = (double)a / b;
			
			System.out.printf("%d / %d = %f%n", a, b, c);
		}
	}
}