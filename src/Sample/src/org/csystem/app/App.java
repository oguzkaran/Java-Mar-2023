/*----------------------------------------------------------------------------------------------------------------------
	
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		B b = new B();

		b.bar(20);

		System.out.printf("b.a = %d%n", b.a);
	}
}

class B extends A {
	//...
	public void bar(int x)
	{
		a = x;
		foo();
	}
}

class A {
	public int a;
	public void foo()
	{
		System.out.println("A.foo");
	}
}