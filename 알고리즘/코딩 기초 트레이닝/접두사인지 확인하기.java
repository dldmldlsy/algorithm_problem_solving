//프로그래머스: 접두사인지 확인하기

// 방법1. startsWith
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
         
        if(my_string.startsWith(is_prefix)){
           answer = 1; 
        }
        
        return answer;
    }
}

// 방법2. substring + equals
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        if((my_string.length()>=is_prefix.length())&&(is_prefix.equals(my_string.substring(0, is_prefix.length())))){
            answer = 1; 
        }
        
        return answer;
    }
}
