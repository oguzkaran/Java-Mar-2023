/*----------------------------------------------------------------------------------------------------------------------
	Anımsanacağı gibi bir dizinin uzunlupu değiştirilemez. Öyleyse bir diziyi büyütmek için yeni bir dizi yaratılmalı,
	eski dizinin elemanları yeni diziye kopyalanması ve referans eski diziden kopartılıp yeni diziyi gösterir duruma
	getirilmelidir. Yani aslında bu durumda mantıksal olarak büyütülmiştür. Ancak burada dizi sürekli olarak, eklenecek
	eleman sayısı kadar büyütülürse artık dizinin elemanlarına erişim O(n) karmaşıklıkta olur, bu da dizinin elemanlarına
	sabit zamanlı erişme avantajını ortadan kaldırmış olur. İşte bu tip durumlarda dizi eklenecek eleman sayısı kadar değil
	biraz daha fazla büyütülür. Böylelikle artık amortize edilmiş sabit zamanlı maliyetle çalışılmış olur. Yani dizinin
	elemanlarına erişim avantajı çoğu zaman kullanılmış olur. İşte, dizileri gerektiğinde büyüten veri yapıları büyütme
	işlemini bu şekilde yaparlar. Diziyi gerektiğinde büyütmek üzere tasarlanmış veri yapılarına "dynamic array" denir.
	Bu tip veri yapılarında dizinin gerçek uzunluğuna "capacity", dizi içerisinde tutulan elemanların sayısına da
	"size/count" denir. Buna göre aslında dinamik büyüyen dizi veri yapısında tutulan elemanlar size kadardır. Ancak
	içsel olarak tutulan dizinin uzunluğu yani capacity değeri size'dan büyük veya size değerine eşit olabilir
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
