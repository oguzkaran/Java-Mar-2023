/*----------------------------------------------------------------------------------------------------------------------
	NYPT'de önemli bir kavram da "encapsulation"'dır. Encapsulation, sınıfın bir elemanının sınıf dışından erişilmesinin
	anlamlı olmadığı durumlarda gizlenmesine verilen genel bir isimdir. Bu şekilde aslında sınıf dışından detaylar
	soyutlanmıiş olur. Bu kavrama aynı zamanda "data/information hiding" de denilmektedir. Aslında bu kavram diğer
	bütün kavramlrda olduğu gibi gerçek hayattan programlamaya aktarılmıştır. Örneğin, araba kullanırken, sürücü
	vites'in içsel olarak nasıl değiştiğini bilmek zorunda değildir. Bu anlamda vites'in değişimine ilşkin içsel
	detaylar sürücüden gizlenmiştir. İşte sınıflarda da sınıfı yazan programcı bazı elemanları sınıf dışından erişime
	kapatabilir. Pratikte, sınıfın public ve protected bölümü dokümante edilir. Bu anlamda aslında gizlenen bölümlerden
	sınıfı kullanan programcının haberi olmaz, olsa da kullanması gerekmez. Bu durumda aslında bir sınıf iki bakış
	açısı söz konusudur: sınıfı yazan bakış açısı (server codes), sınıfı kullanan bakış açısı (client codes). Sınıfı
	yazan programcı, sınıfa ilişkin içsel detayları bilmeli ve sınıfı buna yönelik tasarlamalı ve yazmalıdır. Sınıfı
	kullanan programcı ise sınıfın içsel detayını bilmek zorunda değildir. Yalnızca sınıfın kullanımına ilişkin
	detayları yani sınıfın public bölümünü bilmesi yeterlidir.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}

