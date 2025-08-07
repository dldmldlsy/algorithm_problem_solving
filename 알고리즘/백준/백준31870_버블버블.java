import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = Integer.parseInt(str);

        String[] arrStr = br.readLine().split(" ");
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(int i=0 ;i<n; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
            arr2[i] = Integer.parseInt(arrStr[i]);
        }
        int cnt =0;
        int cnt2= 0;
        int k=1;
        int tmp;
        while(k<n){
            for(int i=0; i<=n-1-k; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    cnt++;
                }
                if (arr2[i] < arr2[i+1]){
                    tmp = arr2[i];
                    arr2[i] = arr2[i + 1];
                    arr2[i + 1] = tmp;
                    cnt2++;
                }
            }
            k++;
        }

        int answer = Math.min(cnt, cnt2+1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(answer));
        bw.flush();
    }
}
