//프로그래머스: n보다 커질 때까지 더하기
class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for(int num: numbers){
            if(answer>n){
                break;
            }
            answer+= num;
        }
        
        return answer;
    }
}
