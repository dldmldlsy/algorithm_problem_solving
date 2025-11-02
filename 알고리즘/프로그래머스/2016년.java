//1차 풀이
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int total=0;
        int[] year = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i=1; i<a; i++){
            total+=year[i];
        }
        total += b;
        total--;
        switch(total%7){
            case 0: 
                answer="FRI";
                break;
            case 1: 
                answer="SAT";
                break;
            case 2: 
                answer="SUN";
                break;
            case 3: 
                answer="MON";
                break;
            case 4: 
                answer="TUE";
                break;
            case 5: 
                answer="WED";
                break;
            case 6: 
                answer="THU";
                break;
        }
            
        return answer;
    }
}

//2차 풀이(더 좋은 풀이)
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int total=0;
        int[] year = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week ={"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        for(int i=1; i<a; i++){
            total+=year[i];
        }
        total += b-1;
        answer = week[total%7];
            
        return answer;
    }
}
