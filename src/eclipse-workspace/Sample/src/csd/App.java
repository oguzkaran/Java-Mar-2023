/*----------------------------------------------------------------------------------------------------------------------
	System.out.format metodu da System.out.printf ile tamamen aynı işi yapar
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir tamsayı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.print("Bir gerçek sayı giriniz:");
		double b = Double.parseDouble(kb.nextLine());
		
		System.out.format("a = %d, b = %f%n", a, b);		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


