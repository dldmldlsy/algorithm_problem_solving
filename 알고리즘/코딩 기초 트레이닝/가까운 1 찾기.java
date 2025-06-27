//프로그래머스: 가까운 1 찾기
class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        
        for(int i=idx+1; i<arr.length; i++){
            if(arr[i]==1){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}
