/*----------------------------------------------------------------------------------------------------------------------	
	short türünden char türüne yapılan explicit dönüşümde sayının bit kalıbı değişmez, bitlerin yorumlanışı değişir. 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		short b = -8128;
		char a;
		
		a = (char)b;
		
		System.out.printf("a = %c, a = %d, a = %04X%n", a, (int)a, (int)a);
		System.out.printf("b = %d, b = %04X%n", b, b);
	}
}