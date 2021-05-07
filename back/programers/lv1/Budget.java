package lv1;

import java.util.Arrays;

public class Budget {
    //    예산
//    https://programmers.co.kr/learn/courses/30/lessons/12982
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 5, 4}, 9));
        System.out.println(solution(new int[]{2,2,3,3}, 10));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum=0;
        for(int num:d){
            sum+=num;
            if(sum<=budget){
                answer++;
            }else{
                break;
            }
        }

        return answer;
    }
}
