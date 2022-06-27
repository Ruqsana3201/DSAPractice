package recursion.problems;

public class _1_PrintNumber5To1 {

    public static void main(String[] args) {
        printNumber(1);
    }

    public static void printNumber(int n) {
//        if (n == 0) {
//            return;
//        }
//        System.out.println(n);
//        printNumber(n - 1);

        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNumber(n + 1);
    }
}
