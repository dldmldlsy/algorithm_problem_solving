import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String rev = my_string.substring(s, e+1);
        //뒤집기
        rev = new StringBuilder(rev).reverse().toString();
        if(e==my_string.length()-1){
            answer = my_string.substring(0, s) + rev;
        }else{
            answer = my_string.substring(0, s) + rev + my_string.substring(e+1);
        }
        return answer;
    }
}
