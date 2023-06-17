/*----------------------------------------------------------------------------------------------------------------------	
	Aşağıdaki örnekte gerekli olmasa da okunabilirliği artırmak açısından parantez kullanılmıştır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Üç sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();	
		int max;
		
		max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		
		System.out.printf("max(%d, %d, %d) = %d%n", a, b, c, max);		
	}
}
