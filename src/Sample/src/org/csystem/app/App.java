/*----------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.wrapper.IntValue;

class App {
	public static void main(String [] args)
	{
		IntValue iVal1 = IntValue.of(10);
		IntValue iVal2 = IntValue.of(10);
		IntValue iVal3 = IntValue.of(128);
		IntValue iVal4 = IntValue.of(128);

		System.out.println(iVal1 == iVal2 ? "Aynı nesne" : "Farklı nesneler");
		System.out.println(iVal3 == iVal4 ? "Aynı nesne" : "Farklı nesneler");
	}
}

