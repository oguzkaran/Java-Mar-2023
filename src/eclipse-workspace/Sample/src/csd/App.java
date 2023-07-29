/*----------------------------------------------------------------------------------------------------------------------
	 Java 11 ile birlikte strip, stripLeading ve stringTrailin metotları eklenmiştir. strip metodu yazının başındaki 
	 ve sonundaki boşluk (whitespace) karakterlerini, stripLeading yazının yalnızca başındaki boşluk karakterlerini ve
	 stripTrailing ise yazının yalnızca sonundaki boşluk karakterlerini atar. strip metodunun trim metodundan farklı 
	 bir örnekten sonra açıklanmaktadır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		StripLeadingTrailingTest.run();
	}
}

class StripLeadingTrailingTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
	
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("(%s)%n", s.strip());
			System.out.printf("(%s)%n", s.stripLeading());
			System.out.printf("(%s)%n", s.stripTrailing());			
		}
		
		System.out.println("Tekrar yapıyor musnuz?");
	}
}
