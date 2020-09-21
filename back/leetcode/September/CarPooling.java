package September;

public class CarPooling {

    public static void main(String[] args) {
        System.out.println(carPooling(new int[][]{{2,1,5},{3,3,7}},4));
    }
    public static boolean carPooling(int[][] trips, int capacity) {
        int[] time = new int[1001];
        int used = 0;
        for (int[] trip : trips) {
            time[trip[1]] += trip[0];
            time[trip[2]] -= trip[0];
        }

        for (int number : time) {
            used += number;
            if (used > capacity) {
                return false;
            }
        }
        return true;
    }
}
