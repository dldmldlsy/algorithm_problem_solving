import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Arrays.sort(tangerine);
        int len = tangerine.length;
        int maxSize = tangerine[len-1];
        
        int[] arr = new int[maxSize+1];
        
        for(int size : tangerine){
            arr[size]++;
        }
        
        Arrays.sort(arr);
        
        int sum = 0; //현재까지 담은 귤 수
      
        for(int i=maxSize; i>0; i--){
            if(arr[i]==0){
                continue;
            }
            if((sum+arr[i])<k){
                sum+= arr[i];
                answer++;
            }else{
                answer++;
                break;
            }
        }
        return answer;
    }
}
