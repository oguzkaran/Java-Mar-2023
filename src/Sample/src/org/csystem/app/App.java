/*----------------------------------------------------------------------------------------------------------------------
	Sıfır çalışması: Aşağıdaki metodu açıklamalara göre ArrayUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
		public static void partitionByThresholdLess(int [] a, int threshold);
	Açıklamalar:
		- Metot birinci parametresi ile aldığı dizinin, ikinci parametresi ile aldığı değerden küçük olan elemanlarını
		dizinin başında, büyük veya eşit olan elemanlarını dizinin sonunda olacak şekilde belirleyecektir

		- Metot içerisinde ayrı bir dizi kullanılmayacaktır

	Not: İleride daha iyisi yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		FirstNonRepeatingCharacterTest.run();
	}
}

class FirstNonRepeatingCharacterTest {
	public static void run()
	{
		String str = "abacabad";

		System.out.println(Solution.firstNonRepeatingCharacter(str) == 'c' ? "Passed" : "Fail");
		str = "abacabaabacaba";
		System.out.println(Solution.firstNonRepeatingCharacter(str) == '_' ? "Passed" : "Fail");
		str = "aabbccdefefexf";
		System.out.println(Solution.firstNonRepeatingCharacter(str) == 'd' ? "Passed" : "Fail");
	}
}

class Solution {
	public static char firstNonRepeatingCharacter(String s)
	{
		int [] counts = new int[26];
		int len = s.length();

		for (int i = 0; i < len; ++i)
			++counts[s.charAt(i) - 'a'];

		for (int i = 0; i < len; ++i) {
			char ch = s.charAt(i);

			if (counts[ch - 'a'] == 1)
				return ch;
		}

		return '_';
	}
}