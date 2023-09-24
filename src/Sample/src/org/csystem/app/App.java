/*----------------------------------------------------------------------------------------------------------------------
	Inheritance NYPT'de var olan bir sınıfın kodlarına dokunmadan yani kodlarını değiştirmeden o sınıfı genişletmek
	için kullanılır. Inheritance için bir takım kavramlar söz konusudur. Örneğin A sınıfından bir B sınıfı türetilmiş
	olsun. Bu durumda A sınıfına B sınıfının taban sınıfı (base class), B sınıfına ise A sınıfının bir türemiş sınıfı (derived class)
	denir. Bu anlamda Java'da base class yerine super class, derived class yerine de sub class terimleri kullanılır. Ayrıca
	genel olarak taban sınıf yerine Biyoloji'den gelen parent class, türemiş sınıf yerine de yine Biyoloji'den gelen
	child class terimleri de kullanılmaktadır. Bir dizi türetme işlemi söz konusu olabilir. Örneğin A sınıfından B sınıfı,
	B sınıfından da C sınıfı türetilmiş olsun. Bu durumda C sınıfının taban sınıfı (super class) ya da doğrudan taban
	sınıfı (direct super class) B'dir. A sınıfı C sınıfının dolaylı taban sınıfıdır (indirect super class). Java'da
	çoklu türetme (multiple inheritance) yoktur. Yani Java'da bir sınıfın birden fazla taban sınıfı olamaz. Bir tane
	taban sınıfı olabilir. Dolaylı taban sınıfları da olabilir. Bu hiyerarşide "A sınıfın C sınıfının taban sınıfıdır"
	cümlesi teknik olarak doğru değildir, doğrusu "A sınıfı C sınıfının bir dolaylı taban sınıfıdır".

	Anahtar Notlar: Java'da multiple inheritance için pratikte karşımıza çıkan problemler için "interface" denilen bir
	tür bildirimi kullanılmaktadır. Bu anlamda aslında pratikte "multiple inheritance"'a doğrudan ihtiyaç olmamaktadır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}

