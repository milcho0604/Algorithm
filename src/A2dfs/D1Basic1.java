package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D1Basic1 {
    static List<List<Integer>> adjList;
    static boolean visited[];

    public static void main(String[] args) {
        // 발문할 수 있는 정점이 여러개인경우 정점번호가 작은 것을 먼저 방문하는
        // dfs알고리즘 형식의 방문순서를 출력하라
        // 0, 1, 3, 2, 4
        int arr[][] = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
        adjList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int a[] : arr) {
            adjList.get(a[0]).add(a[1]);
            // 양방향일경우
            // adjList.get(a[1]).add(a[0]);
        }
        System.out.println(adjList);

        visited = new boolean[5];
        dfs(0);
    }

    public static void dfs(int start) {
        visited[start] = true;
        System.out.println(start);

        for (int target : adjList.get(start)) {
            if (!visited[target]) {
                dfs(target);
            }
        }
    }
}
