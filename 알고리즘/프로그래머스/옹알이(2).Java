//푸는중..
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        boolean possible = false;
        for(int idx = 0; idx<babbling.length; idx++){
            String str = babbling[idx];
            possible = true;
            //words 4개 
            for(int i=0; i<words.length; i++){
                String word = words[i];
                if(str.length()<word.length()){
                    continue;
                }
                if(str.substring(0, word.length()).equals(word)){
                    
                }
            }
        }
        
        return answer;
    }
}
