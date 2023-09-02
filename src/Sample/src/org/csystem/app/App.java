/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Bir okulda merkezi olarak bir Matematik ara sınavı ve final sınavı yapılacak olsun. Şube sayısı ve
	her bir şubede kaç tane olduğu bilgisini klavyeden alınız. Öğrencilerin notlarını [0, 100] aralığında rasgele
	belirleyiniz. Bu işlemlerden sonra her bir şubenin geçme notu ortalaması, geçenlerin sayısı, kalanların sayısı ile
	bu sınava katılan toplam öğrencilerin geçme notu ortalaması, toplam geçenlerin sayısı, toplam kalanların sayısı
	bilgilerini hesaplayan ve rapor olarak döken programı yazınız
	Açıklamalar:
		- Dizinin türünün bir sınıf yazarak belirleyiniz
		- Geçme notu arasınav * 0.4 + final sınavı * 0.6 olarak hesaplanacaktır. Geçme notu >= 50 olan olan öğrenciler
		dersi geçmiş olacaktır
		- Arasınav ve final notları int olarak tutulacaktır, geçme notu double olarak hesaplanacaktır
		- Klavyeden giriş için verilecek mesajları ve rapor çıktısını dilediğiniz gibi belirleyebilirsiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		int [][][] a;

		a = new int[3][4][5];

		for (int i = 0; i < a.length; ++i)
			for (int j = 0; j < a[i].length; ++j)
				for (int k = 0; k < a[i][j].length; ++k)
					a[i][j][k] = i + j + k;

		//...
	}
}

