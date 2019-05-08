package open1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back1373 {
	public static void main(String[] args) throws IOException {		
		// 11001100을넣으면 314나오게 
		//2진수 입력시 8진수로 변환하여 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder input=new StringBuilder(br.readLine());
		StringBuilder output=new StringBuilder();
		int strLen=input.length();
		
		
		int digit=4;
		int tmp=0;
		int tmpSum=0;
		
		// 자릿수 맞추기( 3씩끊어서 부족하면 맨앞에 0으로 채우기
		if(strLen%3==1){
			input.insert(0, "00");
			strLen+=2;
		}else if(strLen%3==2){
			input.insert(0, "0");
			strLen+=1;
		}
		//첫자리는 x4를해주고 그담부터 2씩나누며 자릿수를곱하여 3자리씩 끊어서 더해 8진수자리를 구한다
		for(int i=0;i<strLen;i++){
			tmp=input.charAt(i)-'0';
			tmpSum+=tmp*digit;
			if(digit==1){
				output.append(tmpSum);
				digit=4;
				tmpSum=0;
			}else if(digit!=1&&i==strLen-1){
				output.append(tmpSum);
			}else{
				digit/=2;
			}
		}
		
		bw.write(String.valueOf(output));
		bw.flush();
		
		
	}

}
