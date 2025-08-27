import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        int n = citations.length; 
        int left = 0; 
        int right = n; 
        int mid; 
        while(left<=right){
            mid = (left+right)/2; 
            
            int idx = lowerBound(citations, mid);
            int num = (idx==-1) ? 0 : n-idx;
            if(num>=mid){
                answer = mid; 
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        
        return answer;
    }
    
    int lowerBound(int[] arr, int target){
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=target){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
