package recursion.problems;

public class _2_SumOfNnaturalNumbers {

    private static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int sum = 0;
        printSum(i, n, sum);
    }


}
