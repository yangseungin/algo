package sort;

import java.util.Scanner;
 
public class Back2751 {
    static int[] result;
 
    public static void mergeSort(int left, int right, int[] arr) {
        int mid;
        if (left < right) {
            mid = (left + right) / 2;
            mergeSort(left, mid, arr);
            mergeSort(mid + 1, right, arr);
            merge(left, right, mid, arr);
        }
    }
 
    public static void merge(int left, int right, int mid, int[] arr) {
        int l = left;
        int m = mid + 1;
        int k = left;
 
        while(l <= mid || m <= right) {
            if(l <= mid && m <= right) {
                if(arr[l] <= arr[m]) {
                    result[k] = arr[l];
                    l++;
                }
                else {
                    result[k] = arr[m];
                    m++;
                }
            }
 
            else if(l <= mid && m > right) {
                result[k] = arr[l];
                l++;
            }
            else {
                result[k] = arr[m];
                m++;
            }
            k++;
        }
 
        for(int i = left; i <= right; i++) {
            arr[i] = result[i];
        }
 
 
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        result = new int[n];
        int[] arr = new int[n];
 
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        mergeSort(0, n-1, arr);
 
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
 
        sc.close();
    }
}