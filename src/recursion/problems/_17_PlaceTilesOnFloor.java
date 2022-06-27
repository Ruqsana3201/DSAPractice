package recursion.problems;

public class _17_PlaceTilesOnFloor {

    //place 1*m tiles on n*m floor
    public static int placeTiles(int n, int m) {

        if (n < m)
            return n;
        if (n == m)
            return 2;

        //Vertically
        int vertPacements = placeTiles(n - m, m);

        //Horizontally
        int horPlacements = placeTiles(n - 1, m);
        return horPlacements + vertPacements;
    }

    public static void main(String[] args) {
        System.out.println(placeTiles(2,3));
    }
}
