/*-------------------------------------------------------------
	FILE		: Console.java
	AUTHOR		: Java-Mar-2023 Group
	Last UPDATE	: 29th Oct 2023

	Utility class for standart input and output operations

	Copyleft (c) 1993 C and System Programmers Association
	All Right Free
-------------------------------------------------------------*/
package org.csystem.util.console;

import java.util.Scanner;

public final class Console {
    private static final Scanner KB = new Scanner(System.in);

    private Console()
    {
    }

    public static int readInt(String prompt, String errorPrompt)
    {
        while (true) {
            try {
                System.out.print(prompt);

                return Integer.parseInt(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.print(errorPrompt);
            }
        }
    }

    public static double readDouble(String prompt, String errorPrompt)
    {
        while (true) {
            try {
                System.out.print(prompt);

                return Double.parseDouble(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.print(errorPrompt);
            }
        }
    }
}
