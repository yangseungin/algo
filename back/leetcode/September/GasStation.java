package September;

public class GasStation {
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));

    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int gasTank = 0, idx = 0, sum = 0;

        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            gasTank += gas[i] - cost[i];

            if(gasTank<0){
                idx = i+1;
                gasTank=0;
            }

        }
        return sum<0 ? -1 : idx;
    }
}
