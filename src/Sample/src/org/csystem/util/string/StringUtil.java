/*-------------------------------------------------------------
	FILE		: StringUtil.java
	AUTHOR		: Java-Mar-2023 Group
	Last UPDATE	: 19th Aug 2023

	Utility class for string operations

	Copyleft (c) 1993 C and System Programmers Association
	All Right Free
-------------------------------------------------------------*/
package org.csystem.util.string;


import java.util.Random;

public class StringUtil {
    public static String capitalize(String s)
    {
        return s.isEmpty() ? "" : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

    public static String changeCase(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        int len = s.length();

        for (int i = 0; i < len; ++i) {
            char c = sb.charAt(i);

            sb.setCharAt(i, Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }

        return sb.toString();
    }

    public static int countString(String s1, String s2)
    {
        int count = 0;

        for (int index = 0; (index = s1.indexOf(s2, index)) != -1; ++index, ++count)
            ;

        return count;
    }

    public static int countStringIgnoreCase(String s1, String s2)
    {
        return countString(s1.toLowerCase(), s2.toLowerCase());
    }

    public static String generateRandomText(Random random, int count, String sourceText)
    {
        StringBuilder sb = new StringBuilder(count);
        int sourceTextLen = sourceText.length();

        for (int i = 0; i < count; ++i)
            sb.append(sourceText.charAt(random.nextInt(sourceTextLen)));

        return sb.toString();
    }

    public static String generateRandomTextEN(Random random, int count)
    {
        return generateRandomText(random, count, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }

    public static String generateRandomTextTR(Random random, int count)
    {
        return generateRandomText(random, count, "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ");
    }

    public static boolean isAnagram(String s1, String s2)
    {
        if (s1.length() != s2.length())
            return false;

        int count1 = 0, count2 = 0;
        int len = s1.length();

        for (int i = 0; i < len; ++i) {
            if (s2.indexOf(s1.charAt(i)) == -1)
                return false;

            ++count1;
        }

        for (int i = 0; i < len; ++i) {
            if (s1.indexOf(s2.charAt(i)) == -1)
                return false;

            ++count2;
        }

        return count1 == count2;
    }

    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;
        boolean result = true;

        while (left < right) {
            char cLeft = Character.toLowerCase(s.charAt(left));

            if (!Character.isLetter(cLeft)) {
                ++left;
                continue;
            }

            char cRight = Character.toLowerCase(s.charAt(right));

            if (!Character.isLetter(cRight)) {
                --right;
                continue;
            }

            if (cLeft != cRight) {
                result = false;
                break;
            }

            --right;
            ++left;
        }

        return result;
    }

    public static boolean isPangram(String s, String alphabet)
    {
        int len = alphabet.length();

        for (int i = 0; i < len; ++i) {
            char c = alphabet.charAt(i);

            if (s.indexOf(c) == -1)
                return false;
        }

        return true;
    }

    public static boolean isPangramEN(String s)
    {
        return isPangram(s.toLowerCase(), "abcdefghijklmnopqrstuvwxyz");
    }

    public static boolean isPangramTR(String s)
    {
        return isPangram(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
    }

    public static String padLeading(String s, int len, char ch)
    {
        int length = s.length();

        return len <= length ? s : (ch + "").repeat(len - length) + s;
    }

    public static String padLeading(String s, int len)
    {
        return padLeading(s, len, ' ');
    }

    public static String padTrailing(String s,  int len, char ch)
    {
        int length = s.length();

        return len <= length ? s : s + (ch + "").repeat(len - length);
    }

    public static String padTrailing(String s, int len)
    {
        return padTrailing(s, len, ' ');
    }

    public static String reverse(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }

    public static String trimLeading(String s)
    {
        int i;
        int len = s.length();

        for (i = 0; i < len && Character.isWhitespace(s.charAt(i)); ++i)
            ;

        return s.substring(i);
    }

    public static String trimTrailing(String s)
    {
        int i;

        for (i = s.length() - 1; i >= 0 && Character.isWhitespace(s.charAt(i)); --i)
            ;

        return s.substring(0, i + 1);
    }
}
