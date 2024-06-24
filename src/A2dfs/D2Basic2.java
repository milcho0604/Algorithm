package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D2Basic2 {
    static List<List<Integer>> adjList;
    static boolean visited[];

    public static void main(String[] args) {
//        0, 1, 3, 2, 4, 5
        int arr[][] = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {3, 5}, {2, 4}};

        adjList = new ArrayList<>();
        for(int i=0; i<6; i++){
            adjList.add(new ArrayList<>());
        }

//        양방향인 경우
        for (int a[] : arr) {
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }

        System.out.println(adjList);
        visited = new boolean[6];
        dfs(0);
    }

    public static void dfs(int start) {
        visited[start] = true;
        System.out.println(start);
        for(int target : adjList.get(start)){
            if(!visited[target]){
                dfs(target);
            }
        }
    }
}
