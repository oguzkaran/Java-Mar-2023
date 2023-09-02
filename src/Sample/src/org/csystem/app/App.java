/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte String değil, bir String dizisi for-each döngü deyimi ile dolaşılmıştır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		String [] cities = {"ankara", "istanbul", "izmir", "zonguldak"};

		for (String city : cities)
			System.out.printf("%s%n", city);
	}
}

