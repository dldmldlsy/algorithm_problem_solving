class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            
            answer +=Character.toLowerCase(myString.charAt(i));
        }
        return answer;
    }
}
