package A7binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class B3입국심사 {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};
        long answer = 0;
        Arrays.sort(times);
        int peopleCnt = times.length;
        Stack<Long> myStack = new Stack<>();
        for(int i=0; i<times.length; i++){
            myStack.add((long) times[i]);
        }

        System.out.println();
        while(peopleCnt<=n){
            long t1 = times[0];
            long t2 = times[1];
            long total = t1+t2;

            if(t1>t2){
                total +=t1;
                peopleCnt++;
            }else {
                total+=t2;
                peopleCnt++;
            }
            if(peopleCnt == n){
                answer = total+1;
                break;
            }
        }
//        long start = 1;
//        Arrays.sort(times);
//        long end = (long)times[times.length-1]*n; // 60
//        long answer = end;
//
//        while(start <= end){
//            long p = 0;
//            long mid = (start + end) / 2;
//            System.out.println(mid);
//            for(int t : times){
//                p += mid/t;
//                System.out.println(p);
//            }
//
//            if(p < n){
//                start = mid+1;
//            }else{
//                answer=mid;
//                end = mid-1;
//            }
//        }
//        System.out.println(answer);
//    }
//}
//
//
//class Solution {
//
//    public static long solution(int n, int[] times){
//        long start = 1;
//        Arrays.sort(times);
//        long end = (long)times[times.length-1]*n;
//        long answer = end;
//
//        while(start <= end){
//            long p = 0;
//            long mid = (start + end) / 2;
//
//            for(int t : times){
//                p += mid/t;
//            }
//            System.out.println(p);
//
//            if(p < n){
//                start = mid+1;
//            }else{
//                answer=mid;
//                end = mid-1;
//            }
//        }
//        return answer;
    }
}

