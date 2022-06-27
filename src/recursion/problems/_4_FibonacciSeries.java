package recursion.problems;

public class _4_FibonacciSeries {

    private static void printFibonacciSeries(int firstTerm, int secondTerm, int n) {
        if (n == 0)
            return;
        int sum = firstTerm + secondTerm;
        System.out.println(sum);
        printFibonacciSeries(secondTerm, sum, n - 1);
    }

    public static void main(String[] args) {
        int firstTerm = 0;
        int secondTerm = 1;
        int n = 7;
        System.out.println(firstTerm);
        System.out.println(secondTerm);
        printFibonacciSeries(firstTerm, secondTerm, n - 2);
    }

}
