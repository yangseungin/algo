package Test.sogang2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 민트초코 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        Map<Integer, Integer> mole = new HashMap<>();//분자
        Map<Integer, Integer> deno = new HashMap<>();//분모
        int zeroCount = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("*") && !arr[i].equals("/")) {
                if (arr[i].equals("0"))
                    zeroCount++;

                if (flag)
                    cal(arr[i], mole);
                else
                    cal(arr[i], deno);
            } else {
                if (arr[i].equals("*"))
                    flag = true;
                else if (arr[i].equals("/"))
                    flag = false;
            }
        }

        boolean resFlag = true;
        Iterator<Integer> keys = mole.keySet().iterator();
        while (keys.hasNext()) {
            Integer key = keys.next();
            if (deno.containsKey(key) && mole.get(key) < deno.get(key)) {
                resFlag = false;
                break;
            }

        }
        if (resFlag) {
            Iterator<Integer> denoKeys = deno.keySet().iterator();
            while (denoKeys.hasNext()) {
                Integer key = denoKeys.next();
                if (!mole.containsKey(key)) {
                    resFlag = false;
                    break;
                }
            }
        }
        if (zeroCount > 0 || resFlag)
            System.out.println("mint chocolate");
        else
            System.out.println("toothpaste");


    }

    public static void cal(String str, Map<Integer, Integer> map) {
        int num = Math.abs(Integer.parseInt(str));
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                num /= i;
                map.put(i, map.getOrDefault(i, 0) + 1);
                i--;
            }
        }
        if (num > 1)
            map.put(num, map.getOrDefault(num, 0) + 1);


    }

}
