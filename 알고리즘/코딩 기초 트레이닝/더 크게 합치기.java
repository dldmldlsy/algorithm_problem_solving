// 프로그래머스: 더 크게 합치기
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String abstr = Integer.toString(a) + Integer.toString(b); 
        String bastr = Integer.toString(b) + Integer.toString(a); 
        
        answer = Math.max(Integer.parseInt(abstr), Integer.parseInt(bastr));
        return answer;
    }
}
