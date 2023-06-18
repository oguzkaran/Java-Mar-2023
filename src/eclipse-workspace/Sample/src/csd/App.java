/*----------------------------------------------------------------------------------------------------------------------	 
	Bir Sınıf İçerisinde Aynı İsimde Birden Fazla Metot Yazılması: (Method Overloading)
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{			
		PrintCollatzTest.run();
	}
}

class PrintCollatzTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n == 0)
				break;
			
			NumberUtil.printCollatz(n);
		}
		
		System.out.println("Tekrar Yapıyor musunuz?");
	}
}

class NumberUtil {	
	public static void printCollatz(int n)
	{
		if (n <= 0) {
			System.out.println("Geçersiz sayı!...");
			return;
		}
		
		System.out.println(n);
		
		while (n != 1) {
			n = (n % 2 == 0) ? (n / 2) : (3  * n + 1);
			System.out.println(n);
		}	
	}
}

