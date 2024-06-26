package A3bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B5이동BFS {
    static int minCount;

    public static void main(String[] args) {
        int start = 5;
        int target = 17;
//        start -> target으로 가는 가장 빠른 횟수
//        -1, +1, 현재숫자*2
//        -1 * 2 * 2 + 1 -> 4

        minCount = bfs(start, target);
        System.out.println(minCount);
    }

    private static int bfs(int start, int target) {
        Queue<Integer> que = new LinkedList<>();
        int arr[] = new int[1000];
        que.offer(start);
        Arrays.fill(arr, -1);
        arr[start] = 0;
        while (!que.isEmpty()) {
            int now = que.poll();
            int where = 0;
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    where = now + 1;
                } else if (i == 1) {
                    where = now - 1;
                } else if (i == 2) {
                    where = now * 2;
                }
                if (where>0 && where<1000 && arr[where] == -1) {
                    arr[where] = arr[now] + 1;
                    que.offer(where);
                    if (where == target) {
                        return arr[where];
                    }
                }
            }
        }
        return -1;
    }
}
