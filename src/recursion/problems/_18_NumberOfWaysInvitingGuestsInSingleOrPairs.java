package recursion.problems;

public class _18_NumberOfWaysInvitingGuestsInSingleOrPairs {

    public static int guestCall(int n) {
        if (n == 1 || n < 1) {
            return 1;
        }
        //Single
        int single = guestCall(n - 1);
        //Pair
        int pair = (n - 1) * guestCall(n - 2);
        return single + pair;
    }

    public static void main(String[] args) {
        System.out.println(guestCall(4));
    }
}
