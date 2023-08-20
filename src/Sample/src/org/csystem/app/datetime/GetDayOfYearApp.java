package org.csystem.app.datetime;

import java.util.Scanner;

class GetDayOfYearApp {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.print("Gün ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (day == 0 && month == 0 && year == 0)
				break;
			
			DateUtil.printDateTR(day, month, year);			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
