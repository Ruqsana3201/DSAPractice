package recursion.problems;

public class _11_RemoveDuplicatesFromString {

    public static boolean[] map = new boolean[26];

    private static void removeDuplicates(String str, int index, String newStr) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(index);
        if (map[currentChar - 'a']) {
            removeDuplicates(str, index + 1, newStr);
        } else {
            newStr += currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicates(str, index + 1, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str, 0, " ");
    }

}
