package recursion.problems;

public class _7_PrintStringInReverse {

    public static void printReverseString(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printReverseString(str, index - 1);

    }

    public static void main(String[] args) {
        String str = "Ruqsana";
        int index = str.length() - 1;
        printReverseString(str, index);
    }
}
