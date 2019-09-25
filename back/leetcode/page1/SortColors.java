package page1;

public class SortColors {
	public static void main(String[] args) {
		sortColors(new int[]{2,0,2,1,1,0});
	}

	public static void sortColors(int[] nums) {
		int[] result=new int[3];
		int index=0;
		
		for(int num:nums){
			result[num]+=1;
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<result[i];j++,index++){
				nums[index]=i;
			}
		}
	}

}
