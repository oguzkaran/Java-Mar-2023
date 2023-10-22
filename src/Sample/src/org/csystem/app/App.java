/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnei inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s1 = new Sample(10);
		Sample s2 = new Sample(10);

		System.out.println(s1.equals(s2) ? "Eşit" : "Eşit değil");
	}
}

class Sample {
	private int m_x;

	public Sample(int x)
	{
		m_x = x;
	}

	public int getX()
	{
		return m_x;
	}

	public boolean equals(Object other)
	{
		return other instanceof Sample s && s.m_x == m_x;
	}
}