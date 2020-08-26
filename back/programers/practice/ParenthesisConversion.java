package practice;

import java.util.Stack;

public class ParenthesisConversion {
	static int pos;
	public static void main(String[] args) {
	        System.out.println(solution("(()())()"));
	    
	}

    public static String solution(String p) {
        StringBuilder answer = new StringBuilder();
        if (p.isEmpty()) {
            return "";
        }

        boolean correct = isCorret(p);
        String u = p.substring(0, pos);
        String v = p.substring(pos);

        if (correct) {
            return u + solution(v);
        }

        answer.append("(" + solution(v)+")");
        for(int i=1;i<u.length()-1;i++){
            char ch = u.charAt(i);
            if(ch =='('){
                answer.append(")");
            }else {
                answer.append("(");
            }
        }

        return answer.toString();

    }

    public static boolean isCorret(String str) {
        boolean val = true;
        Stack<Character> stack = new Stack<>();
        int left = 0, right = 0;

        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch == '(') {
                left++;
                stack.push(ch);
            } else {
                right++;
                if (stack.empty()) {
                    val = false;
                } else {
                    stack.pop();
                }
            }
            if (left == right) {
                pos = i + 1;
                return val;
            }
        }
        return true;
    }

}
