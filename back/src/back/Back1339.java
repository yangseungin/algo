package back;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;

public class Back1339 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] alphabet = new int[26];
        int result=0,num=9;

        for(int i=0;i<count;i++){
            char[] chars = br.readLine().toCharArray();

            int pow = (int) Math.pow(10, chars.length - 1);
            for(int j=0;j<chars.length;j++){
                alphabet[chars[j]- 'A'] += pow;
                pow/=10;
            }
        }
        Arrays.sort(alphabet);

        for(int i=alphabet.length-1; i>0; i--){
            if(num==0)
                break;
            result+= alphabet[i]*num--;
        }
        System.out.println(result);

    }
}
