package lv5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AutoComplete {
	public static void main(String[] args) {
		String[] words = { "go", "gone", "guild" };
		System.out.println(solution(words));

	}

	public static int solution(String[] words) {
		int answer = 0;
		//단어 갯수만큼 반복
		TreeNode<String> node = new TreeNode<String>("root");
		for(int i=0;i<words.length;i++){
			
			//해당단어의 길이만큼 반복하는데 단어길이만큼 트리 생
			
			for(int j=0;j<words[i].length();j++){
				System.out.println(words[i].charAt(j));
				TreeNode<String> add = new TreeNode<String>(String.valueOf(words[i].charAt(j)));
				
				
			}
		
			
			
			
			
		}

		return answer;
	}
	public static class TreeNode<T> implements Iterable<TreeNode<T>>{
	    private T data;
	    private TreeNode<T> parent;
	    private List<TreeNode<T>> children;
	 
	    public TreeNode(T data) {
	        this.data = data;
	        this.children = new LinkedList<TreeNode<T>>();
	    }
	 
	    public TreeNode<T> addChild(T child) {
	        TreeNode<T> childNode = new TreeNode<T>(child);
	        childNode.parent = this;
	        this.children.add(childNode);
	        return childNode;
	    }
	 
	    @Override
	    public Iterator<TreeNode<T>> iterator() {
	        // TODO Auto-generated method stub
	        return null;
	    }
	}


	
	
	
	
}
