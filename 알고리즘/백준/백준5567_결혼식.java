import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class boj5567_결혼식 {
    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        visited = new boolean[n+1];

        for(int i=0; i<n+1; i++){
            graph.add(new ArrayList<>());
        }
        int a, b;
        for(int i=0; i<m; i++){
            String[] str = br.readLine().split(" ");
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        System.out.println(bfs(1));

    }
    public static int bfs(int start){
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        int depth = 0;
        int cnt = 0;
        while(!q.isEmpty()&&depth<2){
            int size = q.size();
            for(int i=0; i<size; i++){
                int now = q.poll();
                for(int j=0; j<graph.get(now).size(); j++){
                    int next = graph.get(now).get(j);
                    if(!visited[next]){
                        q.add(next);
                        cnt++;
                        visited[next] = true;
                    }
                }
            }
            depth++;
        }
        return cnt;
    }
}
