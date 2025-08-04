import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        long answer = -1;
        Scanner sc = new Scanner(System.in);

        long x = sc.nextInt();
        long y = sc.nextInt();

        long z = (long) y*100/x;
        if(z>=99){
            System.out.println(-1);
            return;
        }

        long left = 1;
        long right = 1000000000;

        long more;
        while(left<=right){
            more = (left+right)/2;
            long nextZ = (y+more)*100L/(x+more);

            if(nextZ> z){
                answer = more;
                right = more -1;
            }else {
                left = more+1;
            }
        }
        System.out.println(answer);
    }
}
