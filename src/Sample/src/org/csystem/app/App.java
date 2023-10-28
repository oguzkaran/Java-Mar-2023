/*----------------------------------------------------------------------------------------------------------------------

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
	private static void doFor(IX ix)
	{
		//...
		ix.foo();
	}

	public static void run()
	{
		Factory factory = new Factory();

		while (true) {
			System.out.println("-------------------------------------------");
			IX ix = factory.create();

			System.out.println(ix.getClass().getName());

			doFor(ix);
			System.out.println("-------------------------------------------");
			ThreadUtil.sleep(1000);
		}
	}
}
class Factory {
	private final Random m_random = new Random();

	public IX create()
	{
		return switch (m_random.nextInt(4)) {
			case 0 -> new A();
			case 1 -> new B();
			case 2 -> new C();
			default -> new D();
		};
	}
}

class A implements IX {
	//...
	public void foo()
	{
		System.out.println("A.foo");
	}
}

class B implements IX {
	//...
	public void foo()
	{
		System.out.println("B.foo");
	}
}

class C extends B {
	public void foo()
	{
		super.foo();
		System.out.println("C.foo");
	}
}


class D implements IX {
	//...
	public void foo()
	{
		System.out.println("D.foo");
	}
}

interface IX {
	void foo();
}