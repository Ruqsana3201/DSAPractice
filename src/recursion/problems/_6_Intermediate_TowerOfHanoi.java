package recursion.problems;

public class _6_Intermediate_TowerOfHanoi {

    public static void printTowerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        printTowerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        printTowerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 2;
        printTowerOfHanoi(n, "S", "H", "D");
    }
}
