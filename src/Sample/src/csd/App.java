/*----------------------------------------------------------------------------------------------------------------------
	Homework-008-2.sorunun bir çözümü
    (Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String[] args)
    {
        PrintTextApp.run();
    }
}

class PrintTextApp {
    public static void printText(String text)
    {
        int len = text.length();

        for (int i = 0; i < len; ++i)
            System.out.println(text.substring(0, i + 1));
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Bir yazı giriniz:");
            String text = kb.nextLine();

            if ("elma".equals(text))
                break;

            printText(text);
        }
    }
}

