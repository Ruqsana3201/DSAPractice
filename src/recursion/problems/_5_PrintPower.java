package recursion.problems;

public class _5_PrintPower {

    public static int calcPower(int x, int n) {
        //Stack Height == n
//        if (n == 0)    //base case 1
//            return 1;
//        if (x == 0)    //base case 2
//            return 0;
//        int xPownm1 = calcPower(x, n - 1);
//        int xPown = x * xPownm1;
//        return xPown;

        //Stack Height == logn
        if (n == 0)    //base case 1
            return 1;
        if (x == 0)    //base case 2
            return 0;
        int sol = calcPower(x, n / 2);
        if (n % 2 == 0)
            return sol * sol;
        else
            return x * sol * sol;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calcPower(x, n);

        System.out.println(ans);
    }
}
