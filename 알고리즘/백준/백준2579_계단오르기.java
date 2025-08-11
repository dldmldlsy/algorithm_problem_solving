import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // score[i] : i번째(0‑based) 계단의 점수
        int[] score = new int[n];

        for(int i=0; i<n; i++){
            score[i] = Integer.parseInt(br.readLine());
        }

        int[][] dp = new int[n][3];
        //dp[i][1] = i-1칸 안밟고 i칸 밟은 상태(연속 1칸째, i-2칸에서 2칸 점프로옴, i-2칸도착할 때 상태 상관x)
        //dp[i][2] = i-1칸 밟고 i칸 밟은 상태(연속 2칸째, i-1칸 밟을 때 2칸 점프로 밟았어야 함. 그래야 3연속x)

        if(n==1){ //n=1일때 예외처리
            System.out.println(score[0]);
            return;
        }

        //초기값 설정
        dp[0][1] = score[0];
        dp[0][2] = score[0];

        dp[1][1] = score[1];
        dp[1][2] = dp[0][1]+score[1];

        //점화식으로 계단별 점수 계산
        for(int i=2; i<n; i++){
            dp[i][1] = Math.max(dp[i-2][1], dp[i-2][2]) + score[i];
            dp[i][2] = dp[i-1][1] + score[i];
        }

        //마지막칸 밟는 경우 중 최댓값이 최종 점수
        int answer = Math.max(dp[n-1][1], dp[n-1][2]);

        System.out.println(answer);
    }
}
