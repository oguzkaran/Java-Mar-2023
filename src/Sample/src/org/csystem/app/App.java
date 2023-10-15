/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki örnek sınıf ismi ile nitelendirilerek yapılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample.setX(20);

		System.out.printf("Sample.x = %d%n", Sample.getX());
	}
}

class Sample {
	private static int x;

	public static void setX(int x)
	{
		Sample.x = x;
	}

	public static int getX()
	{
		return x;
	}

}
