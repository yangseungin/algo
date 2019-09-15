package page1;

public class Sqrt {
	public static void main(String[] args) {
	System.out.println(mySqrt(4));
		
		
	}
	 public static int mySqrt2(int x) {
	        return (int)Math.sqrt(x);
	    }
	 public static int mySqrt(int x) {
		 if(x<=1) return x;
	        int start=0, end=x;
	        while(start<=end) {
	            int mid = start + (end-start)/2;
	            if(x/mid==mid) 
	                return mid;
	            else if(x/mid<mid)
	                end = mid-1;
	            else
	                start = mid+1;
	        }
	        return end;
	 }
	

}
