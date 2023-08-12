/*----------------------------------------------------------------------------------------------------------------------
	Nitelikli isim arama GENEL kuralları: (else if biçiminde değerlendiriniz):
	3. Aranacak ismin solunda bir paket ismi varsa, isim o paket içerisinde aranır. Burada yine alt paketlere ve üst
	paketlere bakılmaz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		test.Sample s = new org.csystem.app.test.Sample(); //error
	}
}

