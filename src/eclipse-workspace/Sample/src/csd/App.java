/*----------------------------------------------------------------------------------------------------------------------	 
	charAt metoduna pozitif ya da negatif bakımdan sınırlar dışında bir indeksm numarası verildiğinde exception oluşur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();
		
		char c = s.charAt(5);
		
		System.out.printf("c = %c%n", c);
	}
}

