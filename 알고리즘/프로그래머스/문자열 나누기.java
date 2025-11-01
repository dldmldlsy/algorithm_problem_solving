class Solution {
    public int solution(String s) {
        int answer = 0;
        int idx = 0;
        String str = "";
        while(idx<s.length()){
            char c = s.charAt(idx);
            int same = 0;
            int diff = 0;
            while(idx<s.length()){
                if(s.charAt(idx)==c){
                    same++;
                }else{
                    diff++;
                }
                idx++;
                if(same==diff){
                    break;
                }
            }
        
            answer++; 
        }
        return answer;
    }
}
