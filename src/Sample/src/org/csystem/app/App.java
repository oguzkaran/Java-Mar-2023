/*-----------------------------------------------------------------------------------------------------------------------
	Try With Resources Statement:
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
	public static void main(String [] args)
	{

	}
}

class Sample {
	public static void doWork(int a) throws OurException
	{
		if (a % 2 == 0)
			throw new OurException();

		Console.writeLine("a = %d", a);
	}
}

class D implements IX {
	public void foo(int a) throws OurException
	{
		Sample.doWork(a);
		//...
	}
}

class C implements IX {
	public void foo(int a) throws TheirException
	{
		//...
	}
}

class B implements IX {
	public void foo(int a) throws  MyException
	{
		//...
	}
}

class A implements IX {
	public void foo(int a)
	{
		//...
	}
}

interface IX {
	void foo(int a) throws Exception;
 }

 class WrapperException extends RuntimeException {
	public WrapperException(String message)
	{
		this(message, null);
	}

	public WrapperException(String message, Throwable cause)
	{
		 super(message, cause);
	}

	public String getMessage()
	{
		Throwable cause = getCause();
		return String.format("Message: %s%s", super.getMessage(), cause != null ? ", Cause Message:" + cause.getMessage() : "");
	}
 }

class MyException extends Exception {
	//...
}

class YourException extends Exception {
	//...
}

class TheirException extends MyException {
	//...
}

class OurException extends Exception {
	//...
}