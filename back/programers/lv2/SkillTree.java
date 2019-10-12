package lv2;

public class SkillTree {
	public static void main(String[] args) {
		System.out.println(solution("CBD", new String[]{"BACDE","CBADF","AECB","BDA"}));
	}
	
	public static int solution(String skill, String[] skill_trees){
		int answer=0;
		for(int i=0;i<skill_trees.length;i++){
			String tmp = skill_trees[i];
			int cnt=0;
			boolean flag=true;
			for(int j=0;j<tmp.length();j++){
				if(cnt<skill.indexOf(tmp.charAt(j))){
					flag=false;
					break;
				}else if(cnt== skill.indexOf(tmp.charAt(j))){
					cnt++;
				}				
			}
			if(flag){
				answer++;
			}
		}
		
		
		return answer;
	}

}
