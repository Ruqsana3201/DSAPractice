package recursion.problems;

public class _3_Factorial {

    private static int calculateFactorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        int fact_nm1 = calculateFactorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
//        return n * calculateFactorial(n - 1);
    }


    public static void main(String[] args) {
        int n = 5;
        int result = calculateFactorial(n);
        System.out.println(result);
    }


}
