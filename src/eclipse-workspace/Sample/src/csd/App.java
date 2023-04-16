/*----------------------------------------------------------------------------------------------------------------------
	Java'da değişken isimlendirmede $ karakteri kullanılabilir. Hatta isimler $ karakteri ile başlatılabilir. $ karakteri
	tek başına değişken ismi olabilir. Ancak programcı $ karakterini isimlendirmede kullanmamalıdır. 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		int amountOf$s = 1000;
		int $ = 10;
		double $1234 = 3.4;
		
		
		System.out.println(amountOf$s);
		System.out.println($);
		System.out.println($1234);		
	}
}

