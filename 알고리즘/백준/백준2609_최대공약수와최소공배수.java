import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int m = Math.max(a, b);
        int n = Math.min(a, b);

        while(true){
            if(m%n==0){
                break;
            }
            int tmp = m;
            m=n;
            n= tmp%n;
        }

        int gcd = n;

        int lcm = a*b/gcd;

        System.out.println(gcd);
        System.out.println(lcm);

    }
}
