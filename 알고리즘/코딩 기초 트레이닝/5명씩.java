//프로그래머스: 5명씩
class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        int len = names.length;
        
        int size = (len%5==0) ? len/5 : len/5 + 1; 
        
        answer = new String[size];
        
        for(int i = 0; i<size; i++){
            answer[i] = names[i*5];
        }
        return answer;
    }
}
