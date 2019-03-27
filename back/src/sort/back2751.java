package sort;

import java.util.Scanner;

public class back2751 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int count = sc.nextInt();
		// int[] arr = new int[count];

		int[] arr1 = { 3, 3, 5, 10 };
		int[] arr2 = { 2, 4, 6, 9 };
		int[] result = new int[10];

		result = merge_sort(arr1, arr2);
		// 삽입정렬

		printArr(result);

	}

	public static void printArr(int[] Arr) {
		for (int i = 0; i < Arr.length; i++) {
			System.out.println(Arr[i]);
		}

	}

	public static int[] divideArr(int[] arr) {
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
		 * 좌측 재귀 arr1 (array.subList(0, (array.size() - 1) / 2 + 1)));
		 * 
		 *  
		 *  우측 재귀
		 * arr2 (array.subList((array.size() - 1) / 2 + 1, array.size())));
		 * 
		 * 
		 * 
		 * else //원소가 1개면 return array 원소한개반환
		 * 
		 * return combine(arr1,arr2);
		 */

		return merge_sort(subArr1,subArr2);

	}

	public static int[] merge_sort(int[] arr1, int[] arr2) {
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
