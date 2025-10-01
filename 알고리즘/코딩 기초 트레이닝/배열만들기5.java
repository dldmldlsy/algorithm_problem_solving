import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            int num = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(num > k){
                list.add(num);
            }
        }
        
        answer = new int[list.size()];
        // list-> array
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
