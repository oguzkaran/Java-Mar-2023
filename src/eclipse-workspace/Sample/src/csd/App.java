/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Parametresi ile aldığı bir yazının 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		IsPalindromTest.run();
	}
}

class IsPalindromTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.println(StringUtil.isPalindrome(s) ? "Palindrom" : "Palindrom değil");		
		}		
	}
}

class StringUtil {
	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;
		boolean result = true;
		char cLeft = '\0';
		boolean cLeftSelected = false;
		
		while (left < right) {
			if (!cLeftSelected) {
				cLeft = Character.toLowerCase(s.charAt(left));
				
				if (!Character.isLetter(cLeft)) {
					++left;
					continue;
				}
				
				cLeftSelected = true;
			}
			
			char cRight = Character.toLowerCase(s.charAt(right));
			
			if (!Character.isLetter(cRight)) {
				--right;
				continue;
			}
			
			if (cLeft != cRight) {
				result = false;
				break;
			}
			
			--right;
			++left;
			cLeftSelected = false;
		}
		
		return result;
	}	
}



