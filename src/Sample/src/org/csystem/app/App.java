/*----------------------------------------------------------------------------------------------------------------------
	Bazı durumlarda sınıfın public bölümünde de değişiklik yapılması gerekebilir. Bu durumda değişiklik yapılacak eleman
	korunur, yeni eleman gerekirse eklenir. Eski eleman "deprecated" yapılır ve gerekirse ileride silineceği yani
	olmayacağı da söylenir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Date date = new Date(10, 9, 2023);

		System.out.printf("%02d/%02d/%04d%n", date.getDay(), date.getMonth(), date.getYear());

		//...
		date.setDay(6);
		date.setMonth(7);
		date.setYear(2021);

		System.out.printf("%02d/%02d/%04d%n", date.getDay(), date.getMonth(), date.getYear());
	}
}

class Date {
	private String m_dateStr;
	private int m_dayOfWeek;

	//...

	public Date(int day, int month, int year)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%03d", day, month, year);
		//m_dayOfWeek değeri hesaplanıyor
	}

	public void setDay(int day)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%03d", day, getMonth(), getYear());
	}

	public int getDay()
	{
		return Integer.parseInt(m_dateStr.substring(0, 2));
	}

	public int getMonth()
	{
		return Integer.parseInt(m_dateStr.substring(3, 5));
	}

	public int getMonthValue()
	{
		return Integer.parseInt(m_dateStr.substring(3, 5));
	}

	public void setMonth(int month)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%03d", getDay(), month, getYear());
	}

	public int getYear()
	{
		return Integer.parseInt(m_dateStr.substring(6));
	}

	public void setYear(int year)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%03d", getDay(), getMonth(), year);
	}

	public int getDayOfWeek()
	{
		return m_dayOfWeek;
	}
}
