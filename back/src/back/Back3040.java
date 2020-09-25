package back;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Back3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check=false;
        int sum=0;
        int[] heights = new int[9];
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<9;i++)
            heights[i] = sc.nextInt();

        for(int height:heights)
            sum+=height;

        for(int i=0;i<heights.length;i++){
            for (int j = i+1; j < heights.length; j++) {
                if(heights[i]+heights[j]==sum-100){
                    check=true;
                    for (int k = 0; k < heights.length; k++) {
                        if(k ==i || k==j)
                            continue;
                        result.add(heights[k]);
                    }
                    break;
                }

            }
            if(check)
                break;;
        }
        result.sort(null);
        for(int i:result)
            System.out.println(i);

    }
}
