//틀림!!

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int cnt = 0; //찾은 수
        int find = 1; //찾는 등수
        int[] arr = new int[3]; //찾은 학생 번호들
        while(cnt<3){
            for(int i=0; i<rank.length; i++){
                if(rank[i]==find){
                    if(attendance[i]){
                        arr[cnt]=i;
                        cnt++; find++;
                    }else{
                        find++;
                        break;
                    }
                }
            }
        }
        
        answer = 10000*arr[0]+100*arr[1]+arr[2];
        return answer;
    }
}
