import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean sosu = true;
        for(int i=m; i<=n; i++){
            if(i==1){
                continue;
            }
            sosu = true;
            for(int j=2; j<=Math.sqrt(i); j++){ //여기서 시간복잡도 줄이는 것!
                if(i%j==0){
                    sosu = false; break;
                }
            }
            if(sosu){
                System.out.println(i);
            }
        }
    }
}
