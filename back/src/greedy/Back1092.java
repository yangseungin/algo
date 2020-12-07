package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Back1092 {
    static List<Integer> crane, box;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        crane = new ArrayList<>();
        for (int i = 0; i < N; i++)
            crane.add(Integer.parseInt(st.nextToken()));

        int M = Integer.parseInt(br.readLine());
        box = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++)
            box.add(Integer.parseInt(st.nextToken()));
        //입력 받은후 sort
        Collections.sort(crane,(o1, o2) -> o2.compareTo(o1));
        Collections.sort(box,(o1, o2) -> o2.compareTo(o1));
        int time=0;
        if(crane.get(0)<box.get(0))
            System.out.println(-1);
        else{
            while (box.size()>0){
                int idx=0;
                int cnt=0;
                while (idx<N){
                    if(cnt==box.size())
                        break;
                    if(box.get(cnt)<=crane.get(idx)) {
                        box.remove(cnt);
                        idx++;
                    }else if(box.get(cnt)> crane.get(idx))
                        cnt++;
                }
                time++;
            }
            System.out.println(time);
        }
    }
}
