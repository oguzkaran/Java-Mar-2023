/*-----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki mülakat sorusunu inceleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
	public static void main(String [] args)
	{
		int a = Console.readInt("Birinci sayıyı giriniz:", "Hatalı giriş yaptınız!...");
		int b = Console.readInt("İkinci sayıyı giriniz:", "Hatalı giriş yaptınız!...");

		System.out.printf("%d + %d = %d%n", a, b, a + b);
	}
}

