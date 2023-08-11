/*-------------------------------------------------------------
	FILE		: NumberUtil.java
	AUTHOR		: Java-Mar-2023 Group
	Last UPDATE	: 06th Aug 2023
	
	Utility class for numeric operations
	
	Copyleft (c) 1993 C and System Programmers Association
	All Right Free
-------------------------------------------------------------*/
package org.csystem.util.numeric;

public class NumberUtil {
    public static boolean areFriends(int a, int b)
    {
        return sumFactors(a) == b  && sumFactors(b) == a;
    }

    public static int calculateDigitalRoot(int val)
    {
        int root = Math.abs(val);

        while ((root = sumDigits(root)) > 9)
            ;

        return root;
    }

    public static int countDigits(int val)
    {
        return val != 0 ? (int)Math.log10(Math.abs(val)) + 1 : 1;
    }

    public static int digitsFactorialSum(int n)
    {
        int total = 0;

        while (n != 0) {
            total += factorial(n % 10);
            n /= 10;
        }

        return total;
    }

    public static int factorial(int n)
    {
        int result = 1;

        for (int i = 2; i <= n; ++i)
            result *= i;

        return result;
    }

    public static int fibonacciNumber(int n)
    {
        if (n <= 2)
            return n - 1;

        int prev1 = 1, prev2 = 0, val = prev1 + prev2;

        for (int i = 3; i < n; ++i) {
            prev2 = prev1;
            prev1 = val;
            val = prev1 + prev2;
        }

        return val;
    }

    public static int getDigitsPowSum(int val)
    {
        int n = countDigits(val);
        int result = 0;

        while (val != 0) {
            result += pow(val % 10, n);
            val /= 10;
        }

        return result;
    }

    public static long getPrime(int n)
    {
        int count = 0;
        long val = 2;

        while (true) {
            if (isPrime(val))
                ++count;

            if (count == n)
                break;

            ++val;
        }

        return val;
    }

    public static int hardyRamanujanCount(int n)
    {
        int count = 0;

        EXIT_LOOP:
        for (int a = 1; a * a * a < n; ++a)
            for (int b = a + 1; a * a * a + b * b * b <= n; ++b)
                if (a * a * a + b * b * b == n) {
                    if (++count == 2)
                        break EXIT_LOOP;

                    ++a;
                }

        return count;
    }

    public static int indexOfPrime(long val)
    {
        int i = 1;
        long a = 2;

        while (true) {
            if (a == val)
                return i;

            if (isPrime(a))
                ++i;

            ++a;
        }
    }

    public static boolean isArmstrong(int val)
    {
        return val >= 0 && getDigitsPowSum(val) == val;
    }

    public static boolean isDecimalHarshad(int val)
    {
        return val > 0 && val % sumDigits(val) == 0;
    }

    public static boolean isFactorian(int n)
    {
        return n > 0 && digitsFactorialSum(n) == n;
    }

    public static boolean isHardyRamanujan(int n)
    {
        return n > 0 && hardyRamanujanCount(n) == 2;
    }

    public static boolean isPerfect(int val)
    {
        return sumFactors(val) == val;
    }

    public static boolean isPrime(long val)
    {
        if (val <= 1)
            return false;

        if (val % 2 == 0)
            return val == 2;

        if (val % 3 == 0)
            return val == 3;

        if (val % 5 == 0)
            return val == 5;

        if (val % 7 == 0)
            return val == 7;

        for (long i = 11; i * i <= val; i += 2)
            if (val % i == 0)
                return false;

        return true;
    }

    public static boolean isPrimeX(long val)
    {
        boolean result;

        for (long sum = val; (result = isPrime(sum)) && sum > 9; sum = sumDigits(sum))
            ;

        return result;
    }

    public static boolean isSuperPrime(long val)
    {
        return isPrime(val) && isPrime(indexOfPrime(val));
    }

    public static int mid(int a, int b, int c)
    {
        if (a <= b && b <= c || c <= b && b <= a)
            return b;

        if (b <= a && a <= c || c <= a && a <= b)
            return a;

        return c;
    }

    public static int nextClosestFibonacciNumber(int val)
    {
        if (val < 0)
            return 0;

        int prev1 = 1, prev2 = 0, next;

        while (true) {
            next = prev1 + prev2;

            if (val < next)
                return next;

            prev2 = prev1;
            prev1 = next;
        }
    }

    public static int nextClosestPrimeFibonacciNumber(int val)
    {
        if (val < 0)
            return 0;

        int prev1 = 1, prev2 = 0, next;

        while (true) {
            next = prev1 + prev2;

            if (val < next && isPrime(next))
                return next;

            prev2 = prev1;
            prev1 = next;
        }
    }

    public static int nextTotalOfTwoClosestPrimeFibonacciNumber(int val)
    {
        if (val < 0)
            return 1;

        int result;

        return (result = nextClosestPrimeFibonacciNumber(val)) + nextClosestPrimeFibonacciNumber(result);
    }

    public static int pow(int a, int b)
    {
        int result = 1;

        while (b-- > 0)
            result *= a;

        return result;
    }

    public static void printCollatz(int n)
    {
        if (n <= 0) {
            System.out.println("Geçersiz sayı!...");
            return;
        }

        System.out.println(n);

        while (n != 1) {
            n = (n % 2 == 0) ? (n / 2) : (3  * n + 1);
            System.out.println(n);
        }
    }

    public static void printGoldbach(int val)
    {
        for (int a = val - 1; a >= 2; --a) {
            int b = val - a;

            if (isPrime(a) && isPrime(b) && a >= b)
                System.out.printf("%d + %d = %d == %d%n", a, b, a + b, val);
        }
    }

    public static void printPrimefactors(int val)
    {
        if (val == 0)
            return;

        val = Math.abs(val);

        int a = 2;

        while (val != 1) {
            if (val % a == 0) {
                System.out.printf("%d ", a);
                val /= a;
            }
            else
                ++a;
        }

        System.out.println();
    }

    public static int reverse(int val)
    {
        int result = 0;

        while (val != 0) {
            result = result * 10 + val % 10;
            val /= 10;
        }

        return result;
    }

    public static int signum(int a)
    {
        int result;

        if (a > 0)
            result = 1;
        else if (a == 0)
            result = 0;
        else
            result = -1;

        return result;
    }

    public static int sumDigits(long val)
    {
        int total = 0;

        while (val != 0) {
            total += val % 10;
            val /= 10;
        }

        return Math.abs(total);
    }

    public static int sumFactors(long val)
    {
        int result = 1;
        long sqrtVal = (long)Math.sqrt(val);

        for (long i = 2; i <= sqrtVal; ++i)
            if (val % i == 0)
                result += (i == val / i) ? i : (i + val / i);

        return result;
    }

}
