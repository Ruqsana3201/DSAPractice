package recursion.problems;

public class _9_CheckIfArrayIsSorted {

    private static boolean checkArraySorted(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;
        if (arr[index] < arr[index + 1])
            //array is sorted till now
            return checkArraySorted(arr, index + 1);
        else
            return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        System.out.println(checkArraySorted(arr, 0));
    }

}
