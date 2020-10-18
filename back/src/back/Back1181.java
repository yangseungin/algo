package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Back1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        String[] arr = new String[set.size()];
        set.toArray(arr);
        Arrays.sort(arr);

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return Integer.compare(o1.length(), o2.length());
            }
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}