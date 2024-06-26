//package A4greedy;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.HashSet;
//
//public class G2체육복 {
//    public static void main(String[] args) {
//        int n = 5;          // 학생 수
//        int[] lost = {2, 4};     // 체육복을 도난당한 학생들의 번호가 담긴 배열
////        int[] reserve = {1, 3, 5};   //여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
//        int[] reserve = {3};   //여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
//        HashSet<Integer> lostP = new HashSet<>();
//        HashSet<Integer> reserveP = new HashSet<>();
//        Arrays.sort(lost);
//        Arrays.sort(reserve);
////        HashSet<Integer> temp = new HashSet<>();
//        for (int a : lost) {
//            lostP.add(a);
//        }
//        for (int a : reserve) {
//            reserveP.add(a);
//        }
//        int answer = n-lost.length;
//        for (int i = 0; i < lostP.size(); i++) {
//            for (int j = 0; j < reserveP.size(); j++) {
//                if (reserveP.isEmpty() || lostP.isEmpty() || answer == n  ) {
//                    break;
//                }
//                else if (!reserveP.contains(lostP) && answer < n) {
//                    answer++;
//                    reserveP.remove(j);
////                    temp.add(lostP.remove(i));
//                }
//            }
//        }
//        System.out.println(answer);
//    }
//}


package A4greedy;

import java.util.*;

public class G2체육복 {
    public static void main(String[] args) {
        int n = 5;          // 학생 수
        int[] lost = {3, 4};     // 체육복을 도난당한 학생들의 번호가 담긴 배열
//        int[] reserve = {1, 3, 5};   //여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
        int[] reserve = {4, 3};   //여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
        Queue<Integer> lostP = new PriorityQueue<>();
        Queue<Integer> reserveP = new PriorityQueue<>();
        HashSet<Integer> temp = new HashSet<>();
        Queue<Integer> ans = new PriorityQueue<>();

        for (int a : reserve) {
            reserveP.add(a);
        }
        for (int a : lost) {
            if(reserveP.contains(lost[a])){
                reserveP.remove(a);
            } else {
                lostP.add(a);
            }
        }
        System.out.println(reserveP);

    }
}

//package A4greedy;
//
//import java.util.*;
//
//public class G2체육복 {
//    public static void main(String[] args) {
//        int n = 5;          // 학생 수
//        int[] lost = {3, 4};     // 체육복을 도난당한 학생들의 번호가 담긴 배열
//        int[] reserve = {1, 3, 5};   //여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
//        Set<Integer> lostSet = new HashSet<>();
//        Arrays.sort(reserve);
//        for(int i : lost){
//            lostSet.add(i);
//        }
//        for(int i=0; i<reserve.length; i++){
//            if(lostSet.contains(reserve[i])){
//                lostSet.remove(reserve[i]);
//                reserve[i]= -1;
//            }
//        }
//        for(int i=0; i<reserve.length; i++){
//            if(reserve[i] == -1) continue;
//            if(lostSet.contains(reserve[i]-1)){
//                lostSet.remove(reserve[i]-1);
//            } else if (lostSet.contains(reserve[i]+1)) {
//                lostSet.remove(reserve[i]+1);
//            }
//        }
//        System.out.println(n- lostSet.size());
//    }
//}