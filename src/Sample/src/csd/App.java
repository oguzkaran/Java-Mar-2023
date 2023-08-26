/*----------------------------------------------------------------------------------------------------------------------
 	String sınıfının contains metodu, parametresi ile aldığı yazının, countString'in çağrılmasında
 	kullanılan referansa ilişkin yazının içerisinde var olup olmadığını test etmek için kullanılabilir.
 	Anahtar Notlar: contains metodunun metodu CharSequence türündendir. Argüman olarak String referansı
 	geçilebilir. Detaylar ileride ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        IsPangramTest.run();
    }
}

class IsPangramTest {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        IsPangramTRTest.run(kb);
        IsPangramENTest.run(kb);
    }
}

class IsPangramTRTest {
    public static void run(java.util.Scanner kb)
    {

        while (true) {
            System.out.print("Bir yazı giriniz:");
            String s = kb.nextLine();

            if ("elma".equals(s))
                break;

            System.out.println(StringUtil.isPangramTR(s) ? "Pangram" : "Pangram değil");
        }
    }
}

class IsPangramENTest {
    public static void run(java.util.Scanner kb)
    {

        while (true) {
            System.out.print("Input a text:");
            String s = kb.nextLine();

            if ("quit".equals(s))
                break;

            System.out.println(StringUtil.isPangramEN(s) ? "Pangram" : "Not a pangram");
        }
    }
}

class StringUtil {
    public static boolean isPangramEN(String s)
    {
        return isPangram(s.toLowerCase(), "abcdefghijklmnopqrstuvwxyz");
    }

    public static boolean isPangramTR(String s)
    {
        return isPangram(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
    }

    public static boolean isPangram(String s, String alphabet)
    {
        int len = alphabet.length();

        for (int i = 0; i < len; ++i) {
            char c = alphabet.charAt(i);

            if (!s.contains(c + ""))
                return false;
        }

        return true;
    }
}
