package challenges.chall3;

import java.util.*;

public class Q3 {
    static Set<int[]> set;

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5,2,3,3,5,3}));
//        System.out.println(solution(new int[]{0,3,3,0,7,2,0,2,2,0}));
    }

    public static int solution(int[] a) {
        int answer = 0;
        for (int i = 1; i < a.length; i++) {
            if(i%2!=0)
                continue;

            set = new HashSet<>();
            combin(a, new boolean[a.length], 0, a.length, i );
            System.out.println("--------");
            Iterator<int[]> iterator = set.iterator();
            boolean check=true;
            while (iterator.hasNext()) {
                int[] next = iterator.next();
                int idx=0;
                for (int j = 0; j < i/2; j++) {
//                    System.out.println("왼:"+next[idx]+" / 오: "+next[idx+1]);
                    if(next[idx]==next[idx+1]){
                        System.out.println("같음");
                        check=false;
                    }
                    idx+=2;
                }
                if(check){
                    answer=Math.max(answer,next.length);
                }

                System.out.println(Arrays.toString(next));
            }


        }

        System.out.println("END");

        return answer;
    }

    public static void combin(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            int count = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (visited[i] == true) {
                    count++;
                    list.add(i);
                }
            }
            int[] tmp = new int[count];
            for (int i = 0; i < list.size(); i++)
                tmp[i] = arr[list.get(i)];

            Iterator<int[]> iterator = set.iterator();
            boolean flag = true;
            while (iterator.hasNext()) {
                int[] next = iterator.next();
                if (Arrays.equals(next, tmp))
                    flag = false;

            }

            if (flag)
                set.add(tmp);
        } else {
            for (int i = start; i < n; i++) {
                visited[i] = true;
                combin(arr, visited, i + 1, n, r - 1);
                visited[i] = false;
            }
        }

    }


}
