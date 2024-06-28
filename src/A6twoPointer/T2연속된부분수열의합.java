package A6twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class T2연속된부분수열의합 {
    public static void main(String[] args) {
//        int[] sequence = {1, 2, 3, 4, 5};
//        int k = 7;
//        Arrays.sort(sequence);
//        List<int[]> myList = new ArrayList<>();
//        int start = 0;
//        int end = sequence.length-1;
//        while(start<end){
//            int sum = sequence[start] + sequence[end];
//            if(sum == k){
//                myList.add(new int[]{start, end});
//                start++;
//            } else if (sum>k) {
//                end --;
//            }else {
//                start++;
//            }
//        }
//        for (int[] a : myList) {
//            System.out.println(Arrays.toString(a));
//        }

        int[] sequence = {1, 1, 1, 2, 3, 4, 5};
        int k =5;
        List<int[]> myList = new ArrayList<>();
        int start = 0;
        int end = 0;
        int sum = sequence[0];

        while (end < sequence.length) {
            if (sum == k) {
                myList.add(new int[]{start, end});
                sum -= sequence[start];
                start++;
            } else if (sum < k) {
                end++;
                if (end < sequence.length) {
                    sum += sequence[end];
                }
            } else {
                sum -= sequence[start];
                start++;
            }
        }
        myList.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[1]-o1[0]) - (o2[1]-o2[0]);
            }
        });
        for(int[] a : myList){
            System.out.println(Arrays.toString(a));
        }

    }
}
