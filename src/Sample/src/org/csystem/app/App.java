/*----------------------------------------------------------------------------------------------------------------------
	enum sınıfına sabitler dışında elemanlar eklenebilmektedir. Bunun için sabit bildirimlerinin sonunda ; olmalıdır.
	Eğer sabit dışında bir eleman eklenmeyecekse bu durumda noktalı virgül zorunlu değildir. Hatta hiç sabit bildirilmeyecekse
	ve başka elemanlar eklenecekse yine noktalı virgül zorunludur. Şüphesiz hiç sabiti olmayan bir enum, enum'un hedefi
	noktasında anlamsızdır. enum sınıfına ctor da eklenebilir. Ancak enum'un ctor'u ya private olabilir ya da hiç bir
	erişim belirleyici almaz. enum'un ctor'u hiç bir erişim belirleyici almazsa bu private ile aynı anlamdadır. Hatta
	enum türünden bir nesne sınıf içerisinde bile ne operatörü ile programcı tarafından yaratılamaz. Yani, bir enum
	sınıfı türünden nesne sabitler kadardır ve başka bir nesne yaratılamaz. Enum sabitleri yaratılırken herhangi bir
	parantez kullanılmazsa veya içi boş paranetez ile sabit bildirimi yapılırsa bu default ctor çağrılarak ilgili
	nesnenin yaratılacağı anlamına gelir. Programcı isterse parametreli ctor veya ctor'lar da ekleyebilir. Bu durumda
	sabit bildiriminde parantezler ile uygun argümanlar geçilmelidir.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}

enum Month {
	JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);
	private final int m_days;
	Month(int days)
	{
		m_days = days;
	}

	static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	public int getDays(int year)
	{
		return ordinal() == 1 && isLeapYear(year) ? 29 : m_days;
	}
}
