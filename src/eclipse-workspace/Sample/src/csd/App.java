/*----------------------------------------------------------------------------------------------------------------------	 
	 Gerçek sayı sabitinin noktadan tam kısmı sıfır ise sıfır yazılmayabilir, ondalık kısmı sıfır ise yazılmayabilir.
	 0.0 sabitinin yalnızca nokta olarak yazıolması geçersizdir	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		double a = 1.; //1.0
		double b = .1; //0.1
		
		System.out.printf("a = %f, b = %f%n", a, b);
	}
}

