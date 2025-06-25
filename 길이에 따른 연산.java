// [프로그래머스] 길이에 따른 연산
class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        
        int len = num_list.length; 
        
        for(int i=0; i<len; i++){
            if(len>=11){
                answer+=num_list[i];
            }else{
                answer*=num_list[i];
            }
        }
        if(len>=11){
            answer--;
        }
          
        return answer;
    }
}

// 더 좋은 풀이
// 삼항 연산자
class Solution {
    public int solution(int[] num_list) {
        int answer = (num_list.length>=11) ? 0 : 1;
        
        int len = num_list.length; 
        
        for(int i=0; i<len; i++){
            if(len>=11){
                answer+=num_list[i];
            }else{
                answer*=num_list[i];
            }
        }
          
        return answer;
    }
}
