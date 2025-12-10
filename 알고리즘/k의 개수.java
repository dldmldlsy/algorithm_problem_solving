class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String target = ""; 
        target += (char) (k+'0');
        for(int num = i; num<=j; num++){
            String str = Integer.toString(num);
            if(str.contains(target)){
                for(int idx = 0; idx<str.length(); idx++){
                    if(str.charAt(idx)==(char)(k+'0')){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
