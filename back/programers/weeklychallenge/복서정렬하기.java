package weeklychallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 복서정렬하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{50, 82, 75, 120}, new String[]{"NLWL", "WNLL", "LWNW", "WWLN"})));
        System.out.println(Arrays.toString(solution(new int[]{145, 92, 86}, new String[]{"NLW", "WNL", "LWN"})));
    }

    public static int[] solution(int[] weights, String[] head2head) {
        List<Boxer> boxerList = new ArrayList<>();
        for (int i = 0; i < weights.length; i++) {
            int weight = weights[i];
            String[] split = head2head[i].split("");
            double rate = Arrays.stream(split).filter(s -> s.equals("W")).count() / (double) (split.length - 1);
            long count = IntStream
                    .range(0, split.length)
                    .filter(index -> split[index].equals("W") && weights[index] > weight)
                    .count();
            boxerList.add(new Boxer(i + 1, weight, rate, count));
        }
        boxerList.stream()
                .sorted((a, b) -> (int) (b.getWinRate() - a.getWinRate()))
                .collect(Collectors.toList());

        Collections.sort(boxerList, new BoxerComparator());
        return boxerList.stream().mapToInt(Boxer::getNumber).toArray();

    }
}

class Boxer {
    private int number;
    private int weight;
    private double winRate;
    private long winCount;

    public Boxer(int number, int weight, double winRate, long winCount) {
        this.number = number;
        this.weight = weight;
        this.winRate = winRate;
        this.winCount = winCount;
    }

    public int getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public double getWinRate() {
        return winRate;
    }

    public long getWinCount() {
        return winCount;
    }
}

class BoxerComparator implements Comparator<Boxer> {

    @Override
    public int compare(Boxer o1, Boxer o2) {
        if (o1.getWinRate() != o2.getWinRate()) {
            return o2.getWinRate() - o1.getWinRate() > 0 ?
                    1 : o2.getWinRate() - o1.getWinRate() == 0 ?
                    0 : -1;
        }
        if (o1.getWinCount() != o2.getWinCount()) {
            return o2.getWinCount() - o1.getWinCount() > 0 ?
                    1 : o2.getWinCount() - o1.getWinCount() == 0 ?
                    0 : -1;

        }
        if (o1.getWeight() != o2.getWeight()) {
            return o2.getWeight() - o1.getWeight();
        }
        return o1.getNumber() - o2.getNumber();
    }
}
