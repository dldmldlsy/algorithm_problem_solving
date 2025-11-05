class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        boolean possible = false;
        String str, word, pre;
        //각 문자열별로 발음가능여부 확인
        for(int idx = 0; idx<babbling.length; idx++){
            str = babbling[idx];
            pre = "";
            while(str.length()>0){
                possible = false;
                for(int i=0; i<words.length; i++){ //가능한 발음
                    word = words[i];
                    if(str.length()<word.length()){
                        continue;
                    }
                    if(str.substring(0, word.length()).equals(word)){
                        if(!pre.equals(word)){
                            possible = true;
                            pre = word;
                            if(str.length()-word.length()==0){
                                str = "";
                                break;
                            }else{
                                str = str.substring(word.length());
                            }
                            break;
                        }
                    }
                }
                //가능 발음이 없으면 탈락
                if(!possible){
                    break;
                }
            }
            
            if(possible){
               answer++; 
            }
        }
        
        return answer;
    }
}
