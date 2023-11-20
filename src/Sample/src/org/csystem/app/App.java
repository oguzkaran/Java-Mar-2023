/*-----------------------------------------------------------------------------------------------------------------------
	Java'da generic tür parametresi türünden bir nesne ve dizi yaratmanın birden fazla yöntemi vardır. Bu kullanımda
	uyarı mesajı alınacaktır. Uyarı mesajı önemsizdir. Bu yöntemlerin detayları Java ile Uygulama Geliştirme 1 ve 2
	kurslarında "reflection" konusunda ele alınacaktır. Aşağıdaji örneği bir kalıp olarak kabul ederek inceleyiniz.
	Uyarıları görmezden geliniz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}
class Sample<T> {
	private T m_t;

	public Sample()
	{
		m_t = (T)new Object();
	}

	//...
}

class Mample<T> {
	private T [] m_t;

	public Mample(int count)
	{
		m_t = (T[])new Object[count];
	}

	//...
}