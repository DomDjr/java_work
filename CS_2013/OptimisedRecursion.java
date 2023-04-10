public class OptimisedRecursion {
    public static void main (String [] args) {

        //Answers to questions are at the bottom.

        System.out.println(tailPowerN(5, 5, 1));
        System.out.println(tailHarmonicSum(4, 0));
        System.out.println(bestContains("hello", 'o',0, false));
        System.out.println(numOccurences("String is here", 'l', 0, 0));
    }
    //first question in L03
    public static long powerN(int x, int n) {
        //base case
        if (n == 1) {
            return x;
        }
        if (n == 0) {
            return 1;
        }
        else {
            return tailPowerN(x, n, 1);
        }
    }
    //tailrecursion for L03
    public static long tailPowerN(int x, int n, long result){
        if (n == 0) {
            return result;
        }
        else
            return tailPowerN(x, n - 1, x * result);
    }
    //second question in L03
    public static double harmonicSum(int n) {
        //base case
        if (n == 1) {
            return 1.0;
        }
        //recursive case
        else {
            return (1.0/n) + (harmonicSum(n-1));
        }
    }

    //tailrecursion for L03
    public static double tailHarmonicSum(int n, double result) {
        //base case
        if (n == 0) {
            return result;
        }

        //tailrecursion
        else {
            return tailHarmonicSum(n - 1,result + 1.0/n );

        }
    }

    //third question in L03(already optimized)
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

    //fourth question in L03
    public static boolean contains(String s, char c) {
        //base case
        if (s.isEmpty() || s == null) {
            return false;
        }
        else {
            return bestContains(s, c, 0, false);

        }
    }

    //tailrecursion
    public static boolean bestContains(String s, char c, int index, boolean contain) {
        if (s == null || s.isEmpty())
            return false;
        if (index < s.length()) {
            contain = (s.charAt(index) == c) ? true : false;
            index = index + 1;
            contain = bestContains(s, c, index, contain);
        }
        return contain;
    }

    //tailrecursion
    public static int numOccurences(String s, char c, int count, int index) {
        if (s == null || s.isEmpty())
            return count;
        if (index < s.length()) {
            count += (s.charAt(index) == c) ? 1 : 0;
            index = index + 1;
            count = numOccurences(s, c, count, index);
        }
        return count;
    }

    //Answers to question
    //Q1. Were you able to re-work all five methods? If not, which ones did you leave in their original form?
        // No, some methods were already optimized. The method reverseNumber is already optimal so we didnt need to input a tail recursion.
    //Q2. Of the re-worked methods, which performed better (ran faster) than their original versions? (Don't base your answer on only one run!)
        // re-worked methods powerN and numOccurences ran faster than the original in most runs.
    //Q3. Based on your results, does tail recursion lead to performance gain in Java?
        //Depending on the problem and goal, tail recursion CAN lead to performance gain, because the harmonicSum does not save time all the time.
}


