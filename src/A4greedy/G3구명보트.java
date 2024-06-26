//package A4greedy;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
//public class G3구명보트 {
//    public static void main(String[] args) {
//        int[] people = {70, 50, 80, 50};
//        int limit = 100;
//        Arrays.sort(people);
//        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        for (int i : people) {
//            pq.add(i);
//        }
//        int idx =0;
//        while(!pq.isEmpty()){
//           people[idx] = pq.poll();
//           idx++;
//        }
//        int boat = 0;
//        int count = 0;
//        for (int i = 0; i < people.length; i++) {
//            int temp = 0;
//            temp += people[i];
//            if(count>2 && temp+people[i] > limit){
//                boat++;
//                temp =0;
//                count = 0;
//            }else if (temp <= limit && count<3) {
//                count++;
//            }
//        }
//        System.out.println(boat);
//    }
//}

package A4greedy;

import java.util.*;

public class G3구명보트 {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        Arrays.sort(people);
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i : people) {
            deque.add(i);
        }
        int boat = 0;

        while(!deque.isEmpty()){
            int last = deque.pollLast();
            boat ++;
            if (!deque.isEmpty() && last + deque.peekFirst() <= limit ) {
                deque.pollFirst();
            }
        }
        System.out.println(boat);
    }
}




//        for (int i = 0; i < deque.size(); i++) {
//            temp += deque.poll();
//            count ++;
//            if (count > 2 || temp + deque.peek() > limit) {
//                boat++;
//                temp = 0;
//                count = 0;
//                System.out.println(deque.peek());
//            } else if (deque.isEmpty() && temp <= limit && count < 3) {
//                boat++;
//            } else if (temp <= limit && count < 3) {
//                count++;
//
//            }
//        }
