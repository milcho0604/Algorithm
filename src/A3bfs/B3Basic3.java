package A3bfs;

import java.util.*;

public class B3Basic3 {
    static List<List<Integer>> adjList;
    static boolean visited[];
    static int distance[];

    public static void main(String[] args) {
//        0, 1, 2, 3, 4. 5
        int[][] arr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {3, 5}, {2, 4}};

        adjList = new ArrayList<>();
        for(int i=0; i<6; i++){
            adjList.add(new ArrayList<>());
        }

        for (int a[] : arr) {
            adjList.get(a[0]).add(a[1]);
        }

        visited = new boolean[10];
        distance = new int [6];
        int start =0;
        int end = 3;

        int minDistance = bfs(start, end);
        System.out.println(minDistance);

    }

    private static int bfs(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()){
            int temp = queue.poll();
//            System.out.println(temp);
            for(int target : adjList.get(temp)){
//                target을 queue에 add하기 전에 true로 셋팅
                if(!visited[target]){
                    distance[target] = distance[temp]+1;
                    queue.add(target);
                    visited[target] = true;
                    if(target == end){
                        return distance[target];
                    }
                }
            }
        }
        return -1;
    }
}
