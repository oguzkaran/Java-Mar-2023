/*----------------------------------------------------------------------------------------------------------------------
	Akış return deyimine geldiğinde, return deyimine ilişkin ifade önce hesaplanır, elde edilen değere geri dönülür 	  
-----------------------------------------------------------------------------------------------------------------------*/
package csd;


class App {
	public static void main(String [] args) 
	{
		int result;
		
		result = Util.add() * 2;
		
		System.out.println(result);		
	}
}

class Util {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		
		return a + b;		
	}
}
