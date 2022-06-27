package recursion.problems;

import java.util.HashSet;

public class _13_UniqueSubSequence {

    private static void uniqueSubSequences(String str, int index, String newString, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newString))
                return;
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char ch = str.charAt(index);
        uniqueSubSequences(str, index + 1, newString + ch, set);
        uniqueSubSequences(str, index + 1, newString, set);

    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubSequences(str, 0, " ", set);
    }

}
