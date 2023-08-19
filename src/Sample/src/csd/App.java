/*----------------------------------------------------------------------------------------------------------------------
	Homework-008-6.sorunun bir çözümü
	(Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String[] args)
    {
        StringUtilChangeCaseTest.run();
    }
}

class StringUtilChangeCaseTest {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Bir yazı giriniz:");
            String s = kb.nextLine();

            if ("elma".equals(s))
                break;

            System.out.println(StringUtil.changeCase(s));
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

class StringUtil {
    public static String changeCase(String s)
    {
        String str = "";
        int len = s.length();

        for (int i = 0; i < len; ++i) {
            char c = s.charAt(i);

            str += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        }

        return str;
    }
}
