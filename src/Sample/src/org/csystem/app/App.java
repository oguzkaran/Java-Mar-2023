/*----------------------------------------------------------------------------------------------------------------------
	Java 5 ile birlikte, dizi yaratılırken ilk köşeli parantezden sonraki köşeli parantezlerin içerisinde uzunluk bilgisi
	yazıldığında, gösterdiği diziler otomatik olarak yaratılmaktadır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Satır ve sütun sayısını giriniz:");
		int m = kb.nextInt();
		int n = kb.nextInt();
		int [][] a;

		a = new int[m][n];

		for (int i = 0; i < a.length; ++i)
			for (int j = 0; j < a[i].length; ++j)
				a[i][j] = i + j;

		ArrayUtil.print(2, a);
	}
}

