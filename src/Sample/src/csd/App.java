/*----------------------------------------------------------------------------------------------------------------------
	Homework-008-4.sorunun bir çözümü
    (Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String[] args)
    {
        WrapWithParanthesisApp.run();
    }
}

class WrapWithParanthesisApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Bir yazı giriniz:");
            String text = kb.nextLine();

            if ("elma".equals(text))
                break;

            text = "(" + text.strip() + ")";

            System.out.println(text);
        }
    }
}

