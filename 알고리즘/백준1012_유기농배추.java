import java.util.Scanner;

public class Main {

    static int[][] cbg;
    static boolean[][] visited;
    static int[] dirRow = {-1, 0, 1, 0};
    static int[] dirCol = {0, 1, 0, -1};
    static int m, n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int k;
        while(t-->0){
            m = sc.nextInt(); //가로 = 열
            n = sc.nextInt(); //세로 = 행
            k = sc.nextInt(); //배추 수

            cbg = new int[n][m];
            visited = new boolean[n][m];

            int r, c;
            for(int i=0; i<k; i++){
                c = sc.nextInt();
                r = sc.nextInt();
                cbg[r][c] = 1;
            }
            int cnt = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(!visited[i][j]&&cbg[i][j]==1){
                        dfs(i, j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    static void dfs(int r, int c){
        if(visited[r][c]){
            return;
        }
        visited[r][c] = true;

        for(int i=0; i<4; i++){
            int nextRow = r + dirRow[i];
            int nextCol = c + dirCol[i];

            if(nextRow>=0&&nextRow<n&&nextCol>=0&&nextCol<m){
                if(cbg[nextRow][nextCol]==1 && !visited[nextRow][nextCol]){
                    dfs(nextRow, nextCol);
                }
            }
        }
    }
}
