class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            cnt=0;
            char next;
            while(cnt!=index){
                if(c=='z'){
                    next='a';
                }else{
                    next = (char)(c+1);
                }
                if(!skip.contains(Character.toString(next))){
                    cnt++;
                }
                c=next;
            }
            answer+= c;
        }
        return answer;
    }
}
