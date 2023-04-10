public class RecursionPractice {
    public static void main (String [] args) {
        System.out.println(powerN(3,2));
        System.out.println(harmonicSum(4));
        reverseNumber(12345);
        System.out.println(contains("hello", 'o'));
        System.out.println(numOccurences("hello", 'l'));

    }

    public static long powerN(int x, int n) {
        //base case
        if (n == 1) {
            return x;
        }
        if (n == 0) {
            return 1;
        }
        else {
            return x * powerN(x, n - 1);
        }
    }
    public static double harmonicSum(double n) {
    //base case
        if (n == 1) {
            return 1.0;
        }
    //recursive case
        else {
            return (1.0/n) + (harmonicSum(n-1.0));
        }
    }

    public static void reverseNumber(long n ) {
        //base case
        if (n >= 0 && n <= 9) {
            System.out.println(n);
        }
        else {
            System.out.print(n % 10);
            reverseNumber(n/10);
        }
    }

    public static boolean contains(String s, char c) {
        //base case
        if (s.isEmpty() || s == null) {
            return false;
        }
        else {
            return( c == s.charAt(0)) || contains(s.substring(1), c);

        }
    }

    public static int numOccurences(String s, char c) {
        int counter = 0;
        if (s.isEmpty() || s == null) {
            return 0;
        }
        if ( c == s.charAt(0)) {
            counter++;
            numOccurences(s.substring(1), c);
        }
        return counter;
    }

    public static int numOccurences(char c, String s) {
        if (s == null || s.isEmpty())
            return 0;
        else
            return  (s.charAt(0) == c? 1 : 0) + numOccurences(c, s.substring(1));
    }
    /*
    static long recursiveFactorial(int n ) {
        if (n <= 1) {
            return 1;
        }
        else
            return n * recursiveFactorial(n - 1);
    }

    static void tailRecursiveFactorial(int n) {
        tailRecursiveFactorialpriv(n, 1);
    }

    private static long tailRecursiveFactorialpriv(int n, long result) {
        if (n <= 1) {
            return result;
        }
        else {
            return tailRecursiveFactorialpriv(n - 1, n * result);
        }
    }

     */
}
