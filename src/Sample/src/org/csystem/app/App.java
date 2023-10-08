/*----------------------------------------------------------------------------------------------------------------------
	Java'da downcasting işleminde dinamik tür tespiti için yani haklı dönüşüm için düşünülmüş instanceof operatörü
	vardır. instanceof operatörü özel amaçlı, iki operandlı ve araek durumundadır. Operatörün birinci operandı bir
	referans olmalıdır. Bu anlamda temel türden bir değişken olamaz. İkinci operandı bir referans türü olmalıdır. Yine
	temel tür olamaz. Bu operatörün yan etkisi yoktur. Operatör birinci operandına ilişkin referansın dinamik türünün
	ikinci operandına ilişkin türü kapsayıp kapsamadığına bakar ve duruma göre true ya da false değerini üretir. Yukarıdaki
	örnek için downcasting kullanılması daha iyi bir tekniktir
--------------------------------------------------------------------------------------- -------------------------------*/
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

		while (true) {
			System.out.println("---------------------------------------");
			A a = factory.create();
			B b;

			System.out.printf("Dynamic type:%s%n", a.getClass().getName());

			b = (B)a; //downcasting

			b.foo(10);

			System.out.printf("b.x = %d%n", b.x);
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

class F extends D {
	//...
	public F()
	{
		System.out.println("F created");
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
	public int x;

	public void foo(int a)
	{
		System.out.println("B.foo");
		x = a;
	}
}

class A {
	//...
}
