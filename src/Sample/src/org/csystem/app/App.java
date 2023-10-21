/*----------------------------------------------------------------------------------------------------------------------
	abstract bir ctor'u olabilir. Türemiş sınıf nesnesinin yaratılması aşamasında türemiş sınıfın ctor'undan önce
	taban sınıfın ctor'unun çağrıldığını anımsayınız. Abstract sınıfların public ctor'larının olmasının mantıksal
	olarak bir anlamı yoktur. Bu durumda ctor'un protected yapılması uygundur. Şüphesiz private veya no-modifier
	ctor'ların sınıfın domain'i gereği anlamı olabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}

class B extends A {
	//...
	public B(int x)
	{
		super(x);
		//...
	}

	public void foo()
	{
		//...
	}
}

abstract class A {
	protected A(int a)
	{
		//...
	}

	public abstract void foo();
}