/*----------------------------------------------------------------------------------------------------------------------	 
	Mantıksal Operatörler 3 tanedir: && (Logical AND), || (Logical OR), ! (Logical NOT).
	
	&& ve || operatörleri iki operandlı araek durumunda operatörlerdir. ! operatörü tek operandlı ve önek durumunda bir
	operatördür. Bu operatörlerin operandları boolean türden olmak zorundadır. Bu operatörlerin ürettiği değerler de
	boolean türdendir. Bu operatörler Matematikteki mantıksal operatörlere karşılık gelirler.
	
	Mantıksal operatörlerin doğruluk tabloları (truth tables):
	
	a				b				a && b					a || b
  ------------------------------------------------------------------
	T				T				  T						   T
	T				F				  F						   T
	F				T				  F						   T
	F				F				  F						   F
	
	Yukarıdaki tabloya göre şu cümleler söylnebilir:
	"Mantıksal AND işlemi operandlardan en az bir yanlışsa yanlıştır" 
	"Mantıksal OR işlemi operandlardan en az bir doğruysa doğrudur"
	
	a				!a
	T				F
	F				T
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		NumberUtil.print(10, 20);
	}
}

class NumberUtil {
	public static void print(int a, int b)
	{
		System.out.printf("a = %d, b = %d%n", a, b);
	}
}
