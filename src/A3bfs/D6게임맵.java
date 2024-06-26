package A3bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class D6게임맵 {
    static boolean visited[][];

    public static void main(String[] args) {
        // 0 : 벽이 있는 자리, 1 : 벽이 없는 자리
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        Queue<int[]> queue = new LinkedList<>();
        visited = new boolean[maps.length][maps[0].length];
//        큐에 출발지를 추가(좌표 x,y) : 마지막은 0 거리를 달고 다니는 것.
        queue.add(new int[]{0, 0, 1});
        int[] dx = {-1, 1, 0, 0};   // 좌우
        int[] dy = {0, 0, -1, 1};   // 하상
        visited[0][0] = true;
        int answer = -1;            // 문제 조건에서 불가능한 경우에 -1이니까

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
//                가야할 곳의 좌표
                int nextX = current[0] + dx[i];
                int nextY = current[1] + dy[i];
//                좌표가 음수가 아니고 map을 초과할 수 있다는 조건
                if (nextX >= 0 && nextX < maps.length && nextY >= 0 && nextY < maps[0].length&&!visited[nextX][nextY]) {
//                    벽이 막혀있지 않은 경우에 간다
                    if (maps[nextX][nextY] == 1) {
//                        currnet[2]는 queue.add(new int[]{0, 0, 0})에서 마지막 0을 의미
                        queue.add(new int[]{nextX, nextY, current[2] + 1});
                        visited[nextX][nextY] = true;
//                        도착지점 주어진 맵에서의 끝 위치
                        if (nextX == maps.length - 1 && nextY == maps[0].length - 1) {
                            answer = current[2] + 1;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}


//package A3bfs;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class D6게임맵 {
//    static boolean visited[][];
//    static List<List<Integer>> adjList;
//
//    public static void main(String[] args) {
//        // 0 : 벽이 있는 자리, 1 : 벽이 없는 자리
//        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
//        Queue<int[]> queue = new LinkedList<>();
//        visited = new boolean[maps.length][maps[0].length];
////        큐에 출발지를 추가(좌표 x,y) : 마지막은 0 거리를 달고 다니는 것.
//        queue.add(new int[]{0, 0, 1});
//        int[] dx = {-1, 1, 0, 0};   // 좌우
//        int[] dy = {0, 0, -1, 1};   // 하상
//        maps[0][0] = -1;
//        int answer = -1;            // 문제 조건에서 불가능한 경우에 -1이니까
//
//        while (!queue.isEmpty()) {
//            int[] current = queue.poll();
//            for (int i = 0; i < 4; i++) {
////                가야할 곳의 좌표
//                int nextX = current[0] + dx[i];
//                int nextY = current[1] + dy[i];
////                좌표가 음수가 아니고 map을 초과할 수 있다는 조건 +
//                if (nextX >= 0 && nextX < maps.length && nextY >= 0 && nextY < maps[0].length) {
////                    벽이 막혀있지 않은 경우에 간다
//                    if (maps[nextX][nextY] == 1) {
////                        currnet[2]는 queue.add(new int[]{0, 0, 0})에서 마지막 0을 의미
//                        queue.add(new int[]{nextX, nextY, current[2] + 1});
//                        maps[nextX][nextY] = -1;
////                        도착지점 주어진 맵에서의 끝 위치
//                        if (nextX == maps.length - 1 && nextY == maps[0].length - 1) {
//                            answer = current[2] + 1;
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(answer);
//    }
//}
