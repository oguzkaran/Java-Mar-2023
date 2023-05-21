/*----------------------------------------------------------------------------------------------------------------------	 
	Döngü değişkeninin döngüden sonraki değeri kullanılmayacaksa, 1.kısımda bildirilmesi daha iyi bir tekniktir. Bu durumda
	kodu okuyan kişi döngü değişkeninin döngüden önce bildirildiğini görürse, bu değişkenin son değerinin döngüden sonra da
	kullanıldığını algılar. Bu da kodun okunabilirliğini artırır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();		
		
		int i;
		
		for (i = 0; i < n; ++i)
			System.out.printf("%d ", i);
		
		System.out.printf("Döngüden sonra i = %d%n", i);		
		System.out.println("\nTekrar yapıyor musunuz?");		
	}
}

