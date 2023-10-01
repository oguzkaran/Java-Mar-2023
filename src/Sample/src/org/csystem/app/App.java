/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki örnek aşağıdaki daha dinamik hale getirilmiştir. Burada, A heiyararşisine yeni bir sınıf eklendiğinde
	sadece Factory sınıfına o yeni sınıf türünden nesneyi yaratacak kodlar eklendiğinde diğer hiç bir sınıfın kodlarında
	değişiklik yapmadan uygulama yeni tür için de çalışabilecektir. Örnekteki sınıflar ayrı kütüphanelerde hatta ayrı
	ayrı kişiler tarafından yazılmış olabilir. Bu anlamda takım çalışmasına da uygun bir yaklaşım söz konusudur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.thread.ThreadUtil;

import java.util.Random;

class App {
	public static void main(String [] args)
	{
		DemoApp.run();
	}
}

class DemoApp {
	public static void run()
	{
		Factory factory = new Factory();
		Sample sample = new Sample();

		while (true) {
			System.out.println("---------------------------------------");
			A a = factory.create();

			sample.doWork(a);
			System.out.println("---------------------------------------");
			ThreadUtil.sleep(1000);
		}
	}
}

class Factory {
	private final Random m_random = new Random();

	public A create()
	{
		return switch (m_random.nextInt(5)) {
			case 0 -> new B();
			case 1 -> new C();
			case 2 -> new D();
			case 3 -> new E();
			default -> new F();
		};
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

class F extends D {
	//...
	public F()
	{
		System.out.println("F created");
	}
}
class E extends C {
	//...
	public E()
	{
		System.out.println("E created");
	}
}

class D extends A {
	//...
	public D()
	{
		System.out.println("D created");
	}
}

class C extends B {
	//...
	public C()
	{
		System.out.println("C created");
	}
}

class B extends A {
	//...
	public B()
	{
		System.out.println("B created");
	}
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
