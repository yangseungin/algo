package goorm.nhn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class testcase2 {
	static String matrix[][];
    static int array[];
    static int N, W;
    static void solve(int w) {
        if(W == 0) return;
        boolean flag = false;
        String tmp1 = "";
        String tmp2 = "";
        for(int t = 0; t < array.length; t++)
        {
            w = Math.abs(W % array[t]);
            if(t % 2 == 0) flag = (W>0)?true:false;
            else flag = (W>0)?false:true;
            while(w-- > 0)
            {
                if(flag)
                {
                    tmp1 = matrix[t][t];
                    matrix[t][t] = matrix[t+1][t];
                    tmp2 = tmp1;
                    for(int i = t+1; i <= N-t-1; i++)
                    {
                        tmp1 = matrix[t][i];
                        matrix[t][i] = tmp2;
                        tmp2 = tmp1;
                    }
                    for(int i = t+1; i <= N-t-1; i++)
                    {
                        tmp1 = matrix[i][N-t-1];
                        matrix[i][N-t-1] = tmp2;
                        tmp2 = tmp1;
                    }
                    for(int i = N-t-2; i >= t; i--)
                    {
                        tmp1 = matrix[N-t-1][i];
                        matrix[N-t-1][i] = tmp2;
                        tmp2 = tmp1;
                    }
                    for(int i = N-t-2; i > t; i--)
                    {
                        tmp1 = matrix[i][t];
                        matrix[i][t] = tmp2;
                        tmp2 = tmp1;
                    }
                }
                else if(!flag)
                {
                    tmp1 = matrix[t+1][t];
                    matrix[t+1][t] = matrix[t][t];
                    tmp2 = tmp1;
                    for(int i = t+2; i <= N-t-1; i++)
                    {
                        tmp1 = matrix[i][t];
                        matrix[i][t] = tmp2;
                        tmp2 = tmp1;
                    }
                    for(int i = t+1; i <= N-t-1; i++)
                    {
                        tmp1 = matrix[N-t-1][i];
                        matrix[N-t-1][i] = tmp2;
                        tmp2 = tmp1;
                    }
                    for(int i = N-t-2; i >= t; i--)
                    {
                        tmp1 = matrix[i][N-t-1];
                        matrix[i][N-t-1] = tmp2;
                        tmp2 = tmp1;
                    }
                    for(int i = N-t-2; i >= t; i--)
                    {
                        tmp1 = matrix[t][i];
                        matrix[t][i] = tmp2;
                        tmp2 = tmp1;
                    }
                }
            }
        }
    }
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        
	        
	        matrix = new String[][] { { "강미나", "김도연", "김세정", "김소혜", "김청하" }, { "유연정", "임나영", "전소미", "정채연", "주결경" },
				{ "최유정", "강시라", "기희현", "김나영", "김소희" }, { "박소연", "윤채경", "이해인", "전소연", "정은우" },
				{ "한혜리", "강예빈", "권은빈", "김다니", "김서경" } };
	        
				N = matrix.length;
		        W = -2;
	        if(N == 1)
	        {
	            W = 0;
	        }
	        else
	        {
	            array = new int[N/2];
	            for(int i = 0; i < array.length; i++)
	            {
	                array[i] = 4*(N-(2*i))-4;
	            }
	            solve(W);
	        }
	        for(int i = 0; i < N; i++)
	        {
	            for(int j = 0; j < N; j++)
	            {
	                bw.write(matrix[i][j] + " ");
	            }
	            bw.write("\n");
	        }
	        bw.flush();
	        bw.close();
		
		
		
	}
	
	public static void solution(){
		
	}

}
