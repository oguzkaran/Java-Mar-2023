/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıfı Çalışması: Parametresi ile aldığı iki yazının birinci içerisinde ikincisinden kaç tane olduğu bilgisine
	geri dönen countString isimli metodu StringUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	Örnek: xxx yazısı içerisinde xx 2 tane vardır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		CountStringTest.run();
		
	}
}

class CountStringTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("Aranacak yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			int count = StringUtil.countString(s1, s2);
			
			System.out.print("Sayı:%d%n", count);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class StringUtil {
	public static int countString(String s1, String s2)
	{
		//TODO:
	}
}
