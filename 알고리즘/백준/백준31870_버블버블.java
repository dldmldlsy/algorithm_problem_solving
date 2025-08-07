import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정수 n 입력
        String str = br.readLine();
        int n = Integer.parseInt(str);

        // 배열 입력받고 arr, arr2 두 개의 배열에 동일하게 저장
        String[] arrStr = br.readLine().split(" ");
        int[] arr = new int[n];   // 오름차순 정렬용
        int[] arr2 = new int[n];  // 내림차순 정렬용
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
            arr2[i] = Integer.parseInt(arrStr[i]);
        }

        int cnt = 0;   // 오름차순 버블 정렬 시 swap 횟수
        int cnt2 = 0;  // 내림차순 버블 정렬 시 swap 횟수
        int k = 1;     // 버블 정렬에서 단계마다 비교할 범위 조절
        int tmp;

        // 버블 정렬 시작 (전체 k단계 반복, n-1번 반복)
        while(k < n){
            for(int i = 0; i <= n - 1 - k; i++) {
                // 오름차순 정렬: 현재 값이 다음 값보다 크면 swap
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    cnt++;
                }
                // 내림차순 정렬: 현재 값이 다음 값보다 작으면 swap
                if (arr2[i] < arr2[i + 1]){
                    tmp = arr2[i];
                    arr2[i] = arr2[i + 1];
                    arr2[i + 1] = tmp;
                    cnt2++;
                }
            }
            k++;
        }

        // 오름차순 정렬 vs 내림차순 후 배열 뒤집기 1번 → 최소값 선택
        int answer = Math.min(cnt, cnt2 + 1);

        // 정답 출력
        System.out.println(answer);
    }
}
