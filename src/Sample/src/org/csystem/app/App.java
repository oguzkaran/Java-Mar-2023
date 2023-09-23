/*----------------------------------------------------------------------------------------------------------------------
	Sınıflarası ilişkiler:
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Input marital status as single, married or divorced:");
		String statusStr = kb.nextLine();

		MaritalStatus maritalStatus = MaritalStatus.valueOf(statusStr.toUpperCase());

		System.out.printf("Status:%s%n", maritalStatus);
	}
}

enum MaritalStatus {
	SINGLE, MARRIED, DIVORCED
}

