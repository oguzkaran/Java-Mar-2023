/*----------------------------------------------------------------------------------------------------------------------	 
	break deyimi:
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{			
		PowTest.run();
	}
}

class PowTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Tabanı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.print("Üssü giriniz:");
			int b = Integer.parseInt(kb.nextLine());
			
			System.out.printf("pow(%d, %d) = %d%n", a, b, NumberUtil.pow(a, b));
			
			if (b <= 0)
				break;			
		}		
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
class NumberUtil {
	public static int pow(int a, int b)
	{
		int result = 1;
		
		while (b-- > 0)
			result *= a;
		
		return result;
	}
}
