/*----------------------------------------------------------------------------------------------------------------------
	Homework-008-7.sorunun bir çözümü
    (Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String[] args)
    {
        StringUtilIsIdentifierTest.run();
    }
}

class StringUtilIsIdentifierTest {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Bir yazı giriniz:");
            String s = kb.nextLine();

            if ("elma".equals(s))
                break;

            System.out.println(StringUtil.isIdentifier(s) ? "Geçerli" : "Geçersiz");
        }
    }
}

class StringUtil {
    public static boolean isIdentifier(String s)
    {
        if (s.isBlank() || s.equals("_"))
            return false;

        char first = s.charAt(0);

        if (!Character.isLetter(first) && first != '_' && first != '$')
            return false;

        int len = s.length();

        for (int i = 1; i < len; ++i) {
           char c = s.charAt(i);

            if (!Character.isLetter(c) && !Character.isDigit(c) && c != '_' && c != '$')
                return false;
        }

        return true;
    }
}
