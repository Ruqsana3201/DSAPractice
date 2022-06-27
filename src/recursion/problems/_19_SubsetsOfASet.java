package recursion.problems;

import java.util.ArrayList;

public class _19_SubsetsOfASet {

    public static void findSubsetOfSet(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            System.out.println(subset);
            return;
        }
        //add
        subset.add(n);
        findSubsetOfSet(n - 1, subset);
        //no add
        subset.remove(subset.size() - 1);
        findSubsetOfSet(n - 1, subset);

//        findSubsetOfSet(n - 1, subset);
    }

    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsetOfSet(3, subset);
    }

}
