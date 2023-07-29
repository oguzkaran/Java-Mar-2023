/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Parametresi ile aldığı bir yazının iki yazının anagram olup olmasdıklarını test eden isAnagram 
 	metodunu yazınız ve aşağıdaki kod ile test ediniz.
 	Açıklamalar:
 		- Harflerin  yerleri değiştirildiğinde yazılabilen yazılara denir. Örneğin, bart ve brat yazıları anagramdır
 		- Yazıların anlamlı olup olmadıklarına bakılmayacaktır 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		IsAnagramTest.run();
	}
}

class IsAnagramTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		while (true) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			System.out.println(StringUtil.isAnagram(s1, s2) ? "Anagram" : "Anagram değil");		
		}		
	}
}

class StringUtil {
	public static boolean isAnagram(String s1, String s2)
	{
		//TODO:
	}	
}



