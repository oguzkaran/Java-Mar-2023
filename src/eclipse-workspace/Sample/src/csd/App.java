/*----------------------------------------------------------------------------------------------------------------------	 
	String sınıfının static format metodu, printf metodu gibi yazıyı formatlar ancak ekrana basmak yerine formatlanmış
	yazıya ilişkin String referansına geri döner. Bu durumda programcı bu yazıyı dilediği gibi kullanabilir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci tamsayı, ikincisi gerçek sayı olarak iki tane sayı giriniz:");
		int a = kb.nextInt();
		double b = kb.nextDouble();
		
		String str = String.format("a = %02d, b = %.2f", a, b);
		
		System.out.println(str);
	}
}
