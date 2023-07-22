/*----------------------------------------------------------------------------------------------------------------------	 
	Length'i sıfır olan bir string'e boş string (empty string) denir. Boş string tipik olarak iki tane iki tırnak 
	karakterinin bitişik olarak yazılması ile elde edilebilir. Şüphesiz String nesnesi yaratılmış olur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		String s = "";
		
		System.out.printf("Length:%d", s.length());
	}
}

