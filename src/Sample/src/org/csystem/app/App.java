/*----------------------------------------------------------------------------------------------------------------------
	Yazılım geliştirmede bir programın (bu bir kütüphane de olabilir) yeni bir versiyonunda daha önce yazılmış olan
	kodlarda değişiklik yapılması domain (senaryo) açısından gerekmiyorsa, programcı ne kadar az eski kodlara dokunma
	gereği duyuyorsa o kadar kaliteli yazılmış demektir. Buna göre aşağıdaki örnekte Sample sınıfının doWork metodu
	A ve A'dan doğrudan ya da dolaylı türeyen sınıflar açısından yalnızca A sınıfına bağımlıdır (dependency). Bu anlamda
	doWork metodu türden bağımsız (type independent) yazılmıştır. doWork metodu çalışma zamanında aslında daha önce
	bilmediği A'dan doğrudan ya da dolaylı olarak türemiş olan türler ile de çağrılmış olur. Bu durumda, yeni A
	hiyerarşisine yeni bir sınıf eklendiğinde doWork metodunun kodlarında değişiklik yapılması gerekmez. Yani adeta
	yeni eklenen sınıf iyi tasarlanmış bir lego'ya yeni parça ekler gibi ekleme yapılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		B b = new B();
		C c = new C();
		D d = new D();
		A a = new A();
		E e = new E();
		Sample s = new Sample();

		s.doWork(b);
		s.doWork(c);
		s.doWork(d);
		s.doWork(a);
		s.doWork(e);
	}
}

class Sample {
	//...
	public void doWork(A a)
	{
		//...
		a.foo();
		a.bar();
	}
}

class E extends C {
	//...
}

class D extends A {
	//...
}

class C extends B {
	//...
}

class B extends A {
	//...
}

class A {
	//...
	public void foo()
	{
		System.out.println("A.foo");
	}

	public void bar()
	{
		System.out.println("A.bar");
	}
}
