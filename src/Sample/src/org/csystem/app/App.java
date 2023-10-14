/*----------------------------------------------------------------------------------------------------------------------
	Bazı programcılar sınıfların non-static veri elemanları için private olsalar bile bir önek kullanmazlar. Bu durumda
	sınıfın veri elemanı aynı isimde parametre değişkeni olduğu durumda (ki bu durum çok sık olur) ismin gölgelenmemesi
	için veri elemanına this referansı ile erişilir. Bizim için bu durum sınıfın private olmayan veri elemanları için de
	söz konusudur. Aşağıdaki örnekte this kullanımı gereklidir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s = new Sample();

		s.setVal(10);

		int val = s.getVal();

		System.out.printf("value = %d%n", val);
	}
}

class Sample {
	private int val;

	public int getVal()
	{
		return val;
	}

	public void setVal(int val)
	{
		this.val = val;
	}
}
