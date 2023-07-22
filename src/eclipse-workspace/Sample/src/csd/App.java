/*----------------------------------------------------------------------------------------------------------------------	 
	Derleyici bir string literal'ın özdeğişini bir daha görürse, daha önce ilgili sabit için yaratılmış olan String
	nesnesinin referansını verecek kodu üretir. Yani yeni bir String nesnesi yaratılmaz. 
	Aşağıdaki örnekte yine referans karşılaştırması yapılmıştır. Referanslar aynı nesneyi gösterdiklerinden farklı
	"Aynı yazı" ekrana basılır. Şüphesiz karşılaştırma gerçek yazı karşılaştırması değildir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		String s1 = "ankara";
		String s2 = "ankara";
		
		System.out.println(s1 == s2 ? "Aynı yazı" : "Farklı yazılar");
		System.out.println(s1 != s2 ? "Farklı yazılar" : "Aynı yazı");
	}
}

