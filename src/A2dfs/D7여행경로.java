package A2dfs;

import java.util.*;

public class D7여행경로 {
    static boolean visited[];
    static String[] answer;
    static List<String> myList = new ArrayList<>();
    static Stack<String> temp;

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        answer = new String[tickets.length];
        temp = new Stack<>();
        visited = new boolean[tickets.length];
        int line = 0;
        temp.add("ICN");
        dfs(line, "ICN", tickets);
        Collections.sort(myList);
//        System.out.println(myList);
//        answer = myList;
        System.out.println(myList);
//        answer = myList.toArray(new String[0]);
//        System.out.println(Arrays.deepToString(answer));
    }

    private static void dfs(int line, String now, String[][] tickets) {
        if (line == tickets.length) {
//            myList.add(Arrays.toString(temp));
//            myList.add(String.valueOf(temp));
            myList.add(String.join(",", temp));
//            answer = temp.toArray(new String[0]);
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(now)) {
                visited[i] = true;
//                temp[i]= tickets[i][1];
                temp.add(tickets[i][1]);
                dfs(line + 1, tickets[i][1], tickets);
                visited[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
}

//
//
//package A2dfs;
//
//import java.util.*;
//
//class Solution {
//    static boolean[] visited;
//    static List<String> myList;
//    static List<String> path;
//    static String[][] tickets;
//
//    public String[] solution(String[][] tickets) {
//        Solution.tickets = tickets;
//        visited = new boolean[tickets.length];
//        myList = new ArrayList<>();
//        path = new ArrayList<>();
//
//        // 시작점 "ICN"을 경로에 추가
//        path.add("ICN");
//
//        dfs(0, "ICN");
//
//        // 가능한 경로 중 사전순으로 가장 앞서는 경로 선택
//        Collections.sort(myList);
//        return myList.get(0).split(",");
//    }
//
//    private void dfs(int line, String now) {
//        if (line == tickets.length) {
//            myList.add(String.join(",", path));
//            return;
//        }
//        for (int i = 0; i < tickets.length; i++) {
//            if (!visited[i] && tickets[i][0].equals(now)) {
//                visited[i] = true;
//                path.add(tickets[i][1]);
//                dfs(line + 1, tickets[i][1]);
//                visited[i] = false;
//                path.remove(path.size() - 1);
//            }
//        }
//    }
//}
