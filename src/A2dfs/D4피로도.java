package A2dfs;

public class D4피로도 {
    static boolean visited[];
    static int max=Integer.MIN_VALUE;       // static으로 선언하지 않고 dfs메서드 안에 선언하면 초기화 발생 주의
    public static void main(String[] args) {
        int k = 80; // 소모 가능한 피로도
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}}; // 최소 피로도, 소모피로도

        visited = new boolean[dungeons.length];
        int answer = dfs(0, k, dungeons);
        System.out.println(answer);
    }

    private static int dfs(int n, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k > dungeons[i][1]) {
                visited[i] = true;
                dfs(n + 1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        for (int i = 0; i < dungeons.length; i++) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}


//class Solution {
//    static boolean[] visited;
//    static int max = Integer.MIN_VALUE;
//
//    public int solution(int k, int[][] dungeons) {
//        visited = new boolean[dungeons.length];
//
//        dfs(0, k, dungeons);
//        return max;
//    }
//
//    private void dfs(int n, int k, int[][] dungeons) {
//        for (int i = 0; i < dungeons.length; i++) {
//            if (!visited[i] && k >= dungeons[i][0]) { // 최소 피로도 조건 확인
//                visited[i] = true;
//                dfs(n + 1, k - dungeons[i][1], dungeons); // 소모 피로도 반영
//                visited[i] = false;
//            }
//        }
//        if (n > max) {
//            max = n;
//        }
//    }
//}
