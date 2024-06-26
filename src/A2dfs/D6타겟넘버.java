package A2dfs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class D6타겟넘버 {
    static boolean visited[];
    static int count = 0;

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        visited = new boolean[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            dfs(0, target , numbers);
        }
        System.out.println(count);
    }

    private static void dfs(int length, int target, int[] numbers) {
        int sum = 0;
        if (length == numbers.length && sum == target) {
            count ++;
        }

        for(int i=0; i<2; i++){
            dfs(length+1,target,numbers);
        }
    }
}
