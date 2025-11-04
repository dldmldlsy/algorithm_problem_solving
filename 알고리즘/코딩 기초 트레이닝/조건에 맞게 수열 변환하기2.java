import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] brr = new int[arr.length];
        while(true){
            for(int i=0; i<arr.length; i++){
                int num = arr[i];
                if(num>=50&&num%2==0){
                    brr[i] = num/2;
                }else if(num<50&&num%2==1){
                    brr[i] = 2*num+1;
                }else{
                    brr[i] = num;
                }
            }
        
            if(Arrays.equals(arr, brr)){
                break;
            }else{
                answer++;
                arr = Arrays.copyOf(brr, brr.length);
                brr = new int[arr.length];
            }
        }
        
        return answer;
    }
}
