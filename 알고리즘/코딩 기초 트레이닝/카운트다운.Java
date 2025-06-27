//프로그래머스: 카운트다운
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        int size = start_num-end_num + 1;
        answer = new int[size];
        int value = start_num;
        for(int i=0; i<size; i++){
            answer[i] = value--;
        }
        
        return answer;
    }
}
