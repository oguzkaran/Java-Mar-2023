/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Parametresi ile aldığı bir yazının palindrom olup olmadığını test eden isPalindrome metodunu StringUtil
 	sınıfı içerisinde yazınız ve test ediniz
 	Palindrom: Yalnızca alfabetik karakterlerinin tersinden ve düzünden de aynı olduğu yazılara denir.
 	Örnekler:
	Anastas mum satsana
	Ey Edip Adana'da pide ye
	Ali Papila
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		GenerateRandomText.run();
	}
}

class GenerateRandomText {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random random = new java.util.Random();
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int count = Integer.parseInt(kb.nextLine());
			
			if (count <= 0)
				break;
			
			System.out.printf("Üretilen Yazı:%s%n", StringUtil.generateRandomTextTR(random, count));
			System.out.printf("Generated Text:%s%n", StringUtil.generateRandomTextEN(random, count));
		}		
	}
}

class StringUtil {
	public static String generateRandomText(java.util.Random random, int count, String sourceText)
	{
		String str = "";
		int sourceTextLen = sourceText.length();
		
		for (int i = 0; i < count; ++i)
			str += sourceText.charAt(random.nextInt(sourceTextLen));
		
		return str;
	}
	
	public static String generateRandomTextEN(java.util.Random random, int count)
	{
		return generateRandomText(random, count, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
	
	public static String generateRandomTextTR(java.util.Random random, int count)
	{
		return generateRandomText(random, count, "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ");
	}
}



