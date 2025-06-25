//프로그래머스: 원하는 문자열 찾기 
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        if(myString.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}
