package page1;

public class RemoveElement {
	public static void main(String[] args) {
		System.out.println(removeElement(new int[]{3,2,2,3},3));
	}
    public static int removeElement(int[] nums, int val) {
    	int index=0;
    	for(int i:nums){
    		if(i != val){
    			nums[index++]=i;
    		}
    	}
        
    	return index;
    }

}
