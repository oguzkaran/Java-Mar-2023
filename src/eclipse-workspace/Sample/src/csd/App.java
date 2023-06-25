/*----------------------------------------------------------------------------------------------------------------------	 
    Aşağıdaki örnekte b'nin değeri ++a'dan sonra değişmez değil mi?
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		int a = 20;
		int b;
		
		b = a;
		
		++a;
		
		System.out.printf("a = %d, b = %d%n", a, b);				
	}
}

class Sample {
	public int a;
	public boolean b;
	
	//...
}

