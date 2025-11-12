class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        answer = new int[targets.length];
        int[] alpa = new int[26]; //A: 65
        int click = 0;
        for(String str : keymap){
            click =1;
            for(int i=0; i<str.length(); i++){
                int ascii = (int) str.charAt(i);
                if(alpa[ascii-65]==0){
                    alpa[ascii-65] = click+i;
                }else if(alpa[ascii-65]>click+i){
                    alpa[ascii-65] = click+i;
                }
            }
        }
        int cnt = 0;
        int nextAlpa = 0;
        for(int j=0; j<targets.length; j++){
            String target = targets[j];
            cnt =0;
            
            for(int i=0; i<target.length(); i++){
                nextAlpa = (int) target.charAt(i);
                if(alpa[nextAlpa-65]==0){
                    answer[j] = -1;
                    break;
                }
                cnt += alpa[nextAlpa-65];
            }
            if(answer[j]!=-1){
                answer[j] = cnt;
            }
        }
        
        
        return answer;
    }
}
