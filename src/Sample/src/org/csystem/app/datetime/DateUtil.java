package org.csystem.app.datetime;

public class DateUtil {
	public static void printDateTR(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);	
		
		if (dayOfWeek == -1) {
			System.out.println("Geçersiz tarih!...");
			return;
		}
	
		System.out.printf("%02d/%02d/%04d %s%n", day, month, year, getDayOfWeekStr(dayOfWeek));
		
		if (dayOfWeek == 0 || dayOfWeek == 6)
			System.out.println("Bugün kurs var. Tekrar yaptınız mı?");
		else
			System.out.println("Kurs günü yaklaşıyor. Tekrar yapmayı unutmayınız!...");
	}
	
	public static String getDayOfWeekStr(int dayOfWeek)
	{
		return switch (dayOfWeek) {
				case 0 -> "Pazar";
				case 1 -> "Pazartesi";
				case 2 -> "Salı";
				case 3 -> "Çarşamba";
				case 4 -> "Perşembe";
				case 5 -> "Cuma";
				default -> "Cumartesi";
				};
	}
	
	public static int getDayOfWeek(int day, int month, int year)
	{		
		int totalDays = getDayOfYear(day, month, year);
		
		if (totalDays == -1)
			return -1;
		
		for (int y = 1900; y < year; ++y) 
			totalDays += isLeapYear(y) ? 366 : 365;
		
		return totalDays % 7;		
	}
	
	public static boolean isWeekend(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		return dayOfWeek == 0 || dayOfWeek == 6;
	}
	
	public static boolean isWeekday(int day, int month, int year)
	{
		return !isWeekend(day, month, year); 
	}
	
	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return -1;
		
		int dayOfYear = day;
		
		switch (month - 1) {
		case 11:
			dayOfYear += 30;
		case 10:
			dayOfYear += 31;
		case 9:
			dayOfYear += 30;
		case 8:
			dayOfYear += 31;
		case 7:
			dayOfYear += 31;
		case 6:
			dayOfYear += 30;
		case 5:
			dayOfYear += 31;
		case 4:
			dayOfYear += 30;
		case 3:
			dayOfYear += 31;
		case 2:
			dayOfYear += isLeapYear(year) ? 29 : 28;			
		case 1:
			dayOfYear += 31;
		}
		
		return dayOfYear;
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return (1 <= day && day <= 31) && (1 <= month && month <= 12)
				&& (year >= 1900) && (day <= getDays(month, year));
	}
	
	public static int getDays(int month, int year)
	{		
		return switch (month) {
		case 4, 6, 9, 11 -> 30;	
		case 2 -> isLeapYear(year) ? 29 : 28;
		default -> 31;
		};		
	}

	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
