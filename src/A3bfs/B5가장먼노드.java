package A3bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B5가장먼노드 {
    static List<List<Integer>> adjList;
    static boolean visited[];
    static int distance[];

    public static void main(String[] args) {
        int vertex[][] = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        int n = 6;
        adjList = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int a[] : vertex) {
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }

        visited = new boolean[n+1];
        distance = new int[n+1];
        int count = bfs(1);
        System.out.println(count);
    }

    private static int bfs(int start) {
        Queue<Integer> myQue = new LinkedList<>();
        visited[start] = true;
        myQue.offer(start);

        while (!myQue.isEmpty()) {
            int temp = myQue.poll();

            for (int target : adjList.get(temp)) {
                if (!visited[target]) {
                    distance[target] = distance[temp] + 1;
                    myQue.add(target);
                    visited[target] = true;

                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] > max) {
                max = distance[i];
            }
        }
        int count =0;
        for (int i = 0; i < distance.length; i++) {
            if(distance[i] == max){
                count++;
            }
        }
        return count;

    }
}


//
//import java.util.ArrayList;
//        import java.util.LinkedList;
//        import java.util.List;
//        import java.util.Queue;
//
//class Solution {
//    static List<List<Integer>> adjList;
//    static boolean visited[];
//    static int distance[];
//
//    public int solution(int n, int[][] edge) {
//        adjList = new ArrayList<>();
//        for (int i = 0; i < n+1; i++) {
//            adjList.add(new ArrayList<>());
//        }
//
//        for (int[] a : edge) {
//            adjList.get(a[0]).add(a[1]);
//            adjList.get(a[1]).add(a[0]);
//        }
//
//        visited = new boolean[n+1];
//        distance = new int[n+1];
//        int count = bfs(1);
//        return count;
//    }
//
//    private int bfs(int start) {
//        Queue<Integer> myQue = new LinkedList<>();
//        visited[start] = true;
//        myQue.offer(start);
//
//        while (!myQue.isEmpty()) {
//            int temp = myQue.poll();
//
//            for (int target : adjList.get(temp)) {
//                if (!visited[target]) {
//                    distance[target] = distance[temp] + 1;
//                    myQue.add(target);
//                    visited[target] = true;
//                }
//            }
//        }
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < distance.length; i++) {
//            if (distance[i] > max) {
//                max = distance[i];
//            }
//        }
//
//        int count = 0;
//        for (int i = 0; i < distance.length; i++) {
//            if (distance[i] == max) {
//                count++;
//            }
//        }
//        return count;
//    }
//}
