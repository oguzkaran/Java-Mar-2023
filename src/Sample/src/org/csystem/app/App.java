/*----------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		B b = new B();
		C c = new C();

		b.foo();
		b.bar();
		b.tar();

		c.foo();
		c.bar();
		c.tar();
		c.zar();
	}
}

class C extends B {
	//...

	public void zar()
	{
		System.out.println("C.zar");
	}
}

class B extends A {
	//...

	public void tar()
	{
		System.out.println("B.tar");
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

	//...
}