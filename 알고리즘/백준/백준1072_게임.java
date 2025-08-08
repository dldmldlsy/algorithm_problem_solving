import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // x: 총 게임 수, y: 이긴 게임 수
        int x, y;
        String[] str = br.readLine().split(" ");
        x = Integer.parseInt(str[0]);
        y = Integer.parseInt(str[1]);
        
        // 현재 승률 z (정수 버림)
        // (long) 캐스팅은 y*100에서 int 오버플로우 방지
        int z = (int) ((long)y*100/x);

        // 승률이 이미 99% 이상이면 더 해도 변하지 않음 → -1 출력
        if(z>=99){
            System.out.println(-1);
            return;
        }
        
        // 이분 탐색 범위 설정
        // left: 최소 추가 게임 수
        // right: 임의로 정한 최대 추가 게임 수 
        long left = 1;
        long right = 1000000000;
        
        // upper bound 탐색
        // 조건: 현재 승률 z를 초과하는 첫 번째 mid 값을 찾기
        while(left<right){
            long mid = (left+right)/2; // 추가로 할 게임 수           
            
            // mid 게임 모두 승리한다고 가정했을 때 새로운 승률
            int newZ = (int) ((y+mid)*100/(x+mid));

            if(newZ <= z){
		            // 승률이 그대로거나 낮음 → 더 많은 게임이 필요함
                left = mid+1;
            }else{
			          // 승률이 올랐음 → 후보지만, 더 작은 값이 있는지 왼쪽 탐색
                right = mid;
            }
        }
        
        // left가 현재 승률 z를 초과하는 최소 게임 수
        System.out.println(left);
    }
}
