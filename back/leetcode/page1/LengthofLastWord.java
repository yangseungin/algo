package page1;

public class LengthofLastWord {
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("a "));
	}

	public static int lengthOfLastWord(String s) {
		s=s.trim();
		int result=0;
		
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)!=' '){
				result++;
			}else{
				break;
			}
		}

		return result;
	}

}
