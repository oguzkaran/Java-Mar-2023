/*----------------------------------------------------------------------------------------------------------------------
	Otomatik kutulama ve otomatik kutu açma Object türüne de yapılabilkmektedir. Aşağıdaki örnekte auto boxing, auto unboxing
	ve derleyicinin ürettiği yaklaşık kodlar gösterilmiştir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Object oi = 10; //auto boxing: Integer.valueOf(10);
		Object od = 20.5; //auto boxing: Double.valueOf(20.5);

		int a = (int)oi; //auto unboxing: ((Integer)oi).intValue();
		double b = (double)od; //auto unboxing: ((Double)od).doubleValue();

		System.out.printf("a = %d, b = %f%n", a, b);
	}
}

