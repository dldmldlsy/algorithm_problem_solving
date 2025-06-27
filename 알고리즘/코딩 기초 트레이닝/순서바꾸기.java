//프로그래머스: 순서바꾸기
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int idx = 0 ;
        answer = new int[num_list.length];
        
        for(int i=n; i<num_list.length; i++){
            answer[idx++] = num_list[i];
        }
        
        for(int i=0; i<n; i++){
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}
