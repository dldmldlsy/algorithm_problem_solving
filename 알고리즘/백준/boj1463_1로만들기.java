import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        
        //예외처리
        if(n==1) {
            System.out.println(0);
            return;
        }else if(n<=3){
            System.out.println(1);
            return;
        }
        
        //초기값 설정
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        
        //dp값 계산
        for(int i=4; i<=n; i++){
            int minusOne = 1 + dp[i-1];
            int modTwo = 1 + dp[i/2];
            int modThree = 1 + dp[i/3];

            if(i%2==0&&i%3==0){
                dp[i] = Math.min(Math.min(modTwo, modThree), minusOne);
            }else if(i%2==0){
                dp[i] = Math.min(minusOne, modTwo);
            }else if(i%3==0){
                dp[i] = Math.min(minusOne, modThree);
            }else{
                dp[i] = minusOne;
            }
        }

        System.out.println(dp[n]);
    }
}
