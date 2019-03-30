package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back2751 {
	static int result[];
	
	public static void main(String[] args) throws IOException {		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     StringBuilder sb = new StringBuilder();
	     int count= Integer.parseInt(br.readLine().trim());
		 int[] Arr = new int[count];
		 result = new int[count];

		 for(int i=0;i<count;i++){
			 Arr[i]=Integer.parseInt(br.readLine().trim());
		 }
		

		merge_sort(Arr,0,count-1);
		
		for(int i=0;i<count;i++){
			sb.append(result[i]+"\n");
		}
		System.out.println(sb);

	}
	public static void merge_sort(int[] arr, int l,int r) {    
        int m=0;
        if(l<r) {
            m = (l+r)/2;
            merge_sort(arr,l,m);    
            merge_sort(arr,m+1,r);
            merge(arr,l,m,r);    //재귀호출다끝나서 다쪼개지면 합치기
        }
    }
    public static void merge(int[] arr, int left,int mid,int right) {
        int l = left;    
        int m = mid+1;    
        int k = left;    
        
        while(l<=mid || m<=right) {   
            if(l<=mid && m<=right) {   
                if(arr[l]<=arr[m]) result[k] = arr[l++];    
                else result[k] = arr[m++];
            }
            else if(l<=mid && m > right)     
                result[k] = arr[l++];
            else result[k] = arr[m++];        
            k++;
        }
        for(int i=left;i<right+1;i++)    
            arr[i] = result[i];
    }
}
