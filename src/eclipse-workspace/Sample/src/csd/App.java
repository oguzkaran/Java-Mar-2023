/*----------------------------------------------------------------------------------------------------------------------	
	Anahtar Notlar: int türünün ve long türünün en büyük ve en küçük değerlerine doğrudan yazmadan aşağıdaki gibi erişilebilir.
	Detaylar ileride ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		double a = -129.4;
		byte b;
		
		b = (byte)a;
		
		System.out.printf("(int)-129 = %08X%n", -129);
		System.out.printf("b = %d, b = %02X%n", b, b);
	}
}

