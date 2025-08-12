import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        Integer[] number = new Integer[numbers.length];
        for(int i=0; i<number.length; i++){
            number[i] = numbers[i];
        }
        Arrays.sort(number, (n1, n2)->{
            String str1 = Integer.toString(n1);
            String str2 = Integer.toString(n2);
            String str12 = str1 + str2;
            String str21 = str2 + str1;
            
            return str21.compareTo(str12);
        });
        
        for(int i=0; i<number.length; i++){
            answer += Integer.toString(number[i]);
        }
        
        if(answer.charAt(0)=='0'){
            answer = "0";
        }
        return answer;
    }
}
