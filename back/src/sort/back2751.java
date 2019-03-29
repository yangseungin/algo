package sort;

import java.util.Scanner;

public class back2751 {
	static int result[];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 int count = sc.nextInt();
		 int[] Arr = new int[count];
		 result = new int[count];

		 for(int i=0;i<count;i++){
			 Arr[i]=sc.nextInt();
		 }
		

		

		merge_sort(Arr,0,count-1);
		

		printArr(result);

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
	
	

	public static void printArr(int[] Arr) {
		for (int i = 0; i < Arr.length; i++) {
			System.out.println(Arr[i]);
		}

	}

	public static int[] divideArr_not_use(int[] arr) {
		int[] temp = null;
		int[] subArr1 = null;
		int[] subArr2 = null;
		if(arr.length!=1){
			
		}else{
			return arr;
		}

		/*
		 * asdf if( arr size!=1) //arr에 원소 두개이상이면 ~~~~
		 * 
		 * 좌측 재귀 arr1 
		 * 
		 *  
		 *  우측 재귀
		 * arr2 
		 * 
		 * 
		 * 
		 * else //원소가 1개면 return array 원소한개반환
		 * 
		 * return combine(arr1,arr2);
		 */

		return merge_sort_not_use(subArr1,subArr2);

	}

	public static int[] merge_sort_not_use(int[] arr1, int[] arr2) {
		int arr1Size = arr1.length;
		int arr2Size = arr2.length;

		int[] temp = new int[arr1Size + arr2Size];
		int arr1Num = 0, arr2Num = 0;
		for (int i = 0; i < arr1Size + arr2Size; i++) {
			System.out.println(arr1Num + " /" + arr2Num);
			if (arr1Num == arr1Size) {
				temp[i] = arr2[arr2Num];
				arr2Num++;
				continue;
			} else if (arr2Num == arr2Size) {
				temp[i] = arr1[arr1Num];
				arr1Num++;
				continue;
			}

			if (arr1[arr1Num] < arr2[arr2Num]) {
				temp[i] = arr1[arr1Num];
				arr1Num++;
			} else {
				temp[i] = arr2[arr2Num];
				arr2Num++;
			}
		}

		return temp;
	}

}
