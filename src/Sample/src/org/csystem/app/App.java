/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı long türden bir sayının basamaklarından oluşan diziye geri dönen digits
	isimli metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	Açıklamalar: Sayının negatif olması durumunda da basamaklardan oluşan dizi pozitif değerler içerecektir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.generateRandomArray;
import static org.csystem.util.array.ArrayUtil.print;

class App {
	public static void main(String [] args)
	{
		Random random = new Random();
		Scanner kb = new Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int [] a = generateRandomArray(random, kb.nextInt(), 0, 100);

		print(2, a);
	}
}
