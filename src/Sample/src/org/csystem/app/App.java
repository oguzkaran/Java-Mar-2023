/*-----------------------------------------------------------------------------------------------------------------------
	Generic bir sınıfın generic bir metodu da olabilmektedir. Buna member generic de denilmektedir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		A<String> as = new A<>();
		A<Integer> ai = new A<>();

		as.foo("ankara", 10);
		as.foo("ankara", true);
		as.foo("ankara", 3.4);
		ai.foo(20, 10);
		ai.foo(20, true);
		ai.foo(20, 3.4);
		ai.<Float>foo(30, 3.4F);
	}
}

class A<T> {
	public <K> void foo(T t, K k)
	{
		//...
	}
}