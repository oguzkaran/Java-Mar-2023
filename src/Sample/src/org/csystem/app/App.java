/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Aşağıda prototipi verilen metodu açıklamalara göre yazınız:
		public static int [] histogramData(int [] a, int n);
	Açıklamalar:
		- Metot parametresi ile aldığı dizinin içerisinde [0, n] aralığında bulunan sayılardan her birinden kaç tane
		olduğunun bilgisini içeren bir diziye geri dönecektir. Yani geri döndürdüğü dizinin sıfır numaralı indeksinde
		sıfırın kaç tane olduğu, 1 numaralı indeksinde 1'in kaç tane olduğu, ..., n numaralı indeksinde n'in kaç tane
		olduğu bilgili bulunacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Arrays;
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
		Arrays.sort(a);
		print(2, a);
	}
}
