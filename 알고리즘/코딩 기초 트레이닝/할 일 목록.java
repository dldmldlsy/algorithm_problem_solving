//프로그래머스: 할 일 목록
import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        
        int todo_num = todo_list.length;
        
        ArrayList<String> list = new ArrayList<>();
        
        int idx = 0;
        for(int i=0; i<finished.length; i++){
            if(!finished[i]){
                list.add(todo_list[i]);
            }
        }
        
        answer = list.toArray(new String[0]);
        
        return answer;
    }
}
