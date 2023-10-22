/*----------------------------------------------------------------------------------------------------------------------
	printf metodu da (dolayısıyla String sınıfının format metodu da) s format karakteri ile toString metodunu çağırarak
	formatlama yapar
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.math.Complex;
import org.csystem.math.geometry.Point;

class App {
	public static void main(String [] args)
	{
		Point p = Point.createCartesian(100, 200);
		Complex c = new Complex(3, 4);

		System.out.printf("Point:%s%n", p);
		System.out.printf("Complex:%s%n", c);
	}
}

