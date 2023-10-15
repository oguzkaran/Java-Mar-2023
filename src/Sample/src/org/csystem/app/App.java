/*----------------------------------------------------------------------------------------------------------------------
	ArrayList sınıfının isEmpty metodu dizinin boş olup olmadığını test etmelk için kullanılır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.ArrayList;
import java.util.Random;

class App {
	public static void main(String [] args)
	{
		ArrayList numbers = new ArrayList();
		Random random = new Random();
		int val;

		while ((val = random.nextInt(0, 11)) != 0)
			numbers.add(0, val);


		if (!numbers.isEmpty()) {
			for (Object o : numbers)
				System.out.printf("%02d ", (int) o);

			System.out.println();
		}
		else
			System.out.println("No number generated!...");
	}
}

