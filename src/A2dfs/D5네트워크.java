package A2dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D5네트워크 {
    static boolean visited[];
    static int count;

    public static void main(String[] args) {
        int n = 3;
//        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int[][] computers = {{1, 1, 0}, {1, 1, 1},{0, 1, 1}};

        visited = new boolean[computers.length + 1];
        count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(n, i, computers);
                count++;
            }
        }
        System.out.println(count);
    }

    private static void dfs(int n, int i, int[][] computers) {
        visited[i] = true;
        for (int j = 0; j < n; j++) {
            if (!visited[j] && computers[i][j] == 1) {
                dfs(n, j, computers);
            }
        }
    }
}
