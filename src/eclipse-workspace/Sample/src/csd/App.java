/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı bir sayının faktoriyel değerine geri döne factorial isimli metodu NumberUtil sınıfı
	içerisinde yazınız ve aşağıdaki kod ile test ediniz
	Açıklamalar:
		- Faktoriyel işlemi 
		0! = 1
		1! = 1
		2! = 1 * 2
		...
		n!= 1 * 2 * ... * n - 1 * n
		- Metot negatif sayılar için 1 değerine geri dönecektir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{			
		FactorialTest.run();
	}
}

class FactorialTest {
	public static void run()
	{
		for (int n = 0; n <= 13; ++n)		
		System.out.printf("%d! = %d%n", n, NumberUtil.factorial(n));
	}
}
class NumberUtil {
	public static int factorial(int n)
	{
		//TODO:
	}
}

