import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//방법1: 정렬 + 이분탐색
public class boj7795_먹을것인가먹힐것인가 {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 개수
        int t = Integer.parseInt(br.readLine());
        int n, m; // A 배열 크기, B 배열 크기

        // 테스트 케이스 반복
        while(t-- > 0){
            // N과 M 입력
            String[] str = br.readLine().split(" ");
            n = Integer.parseInt(str[0]); // A 배열 크기
            m = Integer.parseInt(str[1]); // B 배열 크기

            // A와 B 배열 선언
            int[] arr = new int[n];
            int[] brr = new int[m];

            // A 배열 원소 입력
            String[] aStr = br.readLine().split(" ");
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(aStr[i]);
            }

            // B 배열 원소 입력
            String[] bStr = br.readLine().split(" ");
            for(int i = 0; i < m; i++){
                brr[i] = Integer.parseInt(bStr[i]);
            }

            // B 배열을 오름차순 정렬
            Arrays.sort(brr); // 이진 탐색(lower bound)을 사용하려면 반드시 정렬되어 있어야 함
            int cnt=0; // 먹을 수 있는 쌍의 총 개수

            // A 배열의 각 원소에 대해
            for(int i=0; i<n; i++){
                // lowerBound(brr, arr[i]) = arr[i] 이상(>=)이 처음 나오는 인덱스
                // 즉, arr[i]보다 작은 값들의 개수
                cnt+= lowerBound(brr, arr[i]);
            }

            // 결과 출력
            System.out.println(cnt);
        }
    }

    // lowerBound: target 이상(>=)인 첫 번째 위치 인덱스를 반환
    // 결과적으로 target보다 작은 원소 개수를 구할 수 있음
    public static int lowerBound(int[] array, int target){
        int left = 0;
        int right = array.length;

        // 탐색 구간이 남아있을 동안 반복
        while(left<right){
            int mid = (left+right)/2; // 중간 인덱스 계산
            if(array[mid]<target){
                // mid 값이 target보다 작으면
                // target 이상이 나올 수 있는 범위를 mid+1~right로 좁힘
                left = mid+1;
            }else{
                // mid 값이 target 이상이면
                // target 이상이 나올 첫 위치를 포함하기 위해 right를 mid로 이동
                right = mid;
            }
        }

        // left == right 시 탐색 종료, 해당 값이 target 이상이 처음 나오는 인덱스
        return left;
    }
}

/*
//방법2: 정렬 + 투포인터 방법
public class boj7795_먹을것인가먹힐것인가 {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 개수
        int t = Integer.parseInt(br.readLine());
        int n, m; // A 배열 크기, B 배열 크기

        // 테스트 케이스 반복
        while(t-- > 0){
            // N과 M 입력
            String[] str = br.readLine().split(" ");
            n = Integer.parseInt(str[0]); // A 배열 크기
            m = Integer.parseInt(str[1]); // B 배열 크기

            // A와 B 배열 선언
            int[] arr = new int[n];
            int[] brr = new int[m];

            // A 배열 원소 입력
            String[] aStr = br.readLine().split(" ");
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(aStr[i]);
            }

            // B 배열 원소 입력
            String[] bStr = br.readLine().split(" ");
            for(int i = 0; i < m; i++){
                brr[i] = Integer.parseInt(bStr[i]);
            }

            // 두 배열을 오름차순 정렬
            Arrays.sort(arr);
            Arrays.sort(brr);

            // A는 큰 수부터, B도 큰 수부터 비교하기 위해 마지막 인덱스부터 시작
            int aIndex = n - 1;
            int bIndex = m - 1;
            int cnt = 0; // A 원소가 먹을 수 있는 B 원소 개수 합계

            // 두 포인터 방식으로 탐색
            while(aIndex >= 0 && bIndex >= 0){
                if(arr[aIndex] > brr[bIndex]){
                    // A의 현재 원소가 B의 가장 큰 원소보다 크면,
                    // bIndex+1 개(0 ~ bIndex까지 모든 B 원소)를 먹을 수 있음
                    cnt += bIndex + 1;
                    aIndex--; // 다음으로 큰 A 원소로 이동
                } else {
                    // A의 현재 원소가 B의 현재 원소보다 작거나 같으면
                    // B에서 더 작은 원소를 찾아야 함
                    bIndex--;
                }
            }

            // 결과 출력
            System.out.println(cnt);
        }
    }
}
*/
