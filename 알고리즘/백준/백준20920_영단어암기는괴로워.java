import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        List<String> words = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            String word = br.readLine();
            if(word.length()>=m) {
                if(!map.containsKey(word)){
                    words.add(word);
                }
                map.put(word, map.getOrDefault(word, 0)+1);
            }
        }

        Collections.sort(words, (w1, w2)->{
            if(map.get(w1)!=map.get(w2)){
                return map.get(w2)-map.get(w1);
            }else{
                if(w1.length()!=w2.length()){
                    return w2.length()-w1.length();
                }else{
                    return w1.compareTo(w2);
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<words.size(); i++){
            sb.append(words.get(i)+"\n");
        }

        System.out.println(sb);
    }
}
