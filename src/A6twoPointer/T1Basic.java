package A6twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T1Basic {
    public static void main(String[] args) {
////        아래 배열에서 target이 될 수 있는 두 수의 조합 index를 모두 찾아라
//        int[] nums = {7,8,9,2,4,5,1,3,6}; // (7,3),(8,2),(6,4),(9,1)...
//        int target = 10;
////        2중 for문 구현 : n^2 => 시간초과
//        List<int[]> myList = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if(nums[i]+nums[j] == target){
//                    myList.add(new int[]{nums[i], nums[j]});
//                }
//
//            }
//        }
//        for (int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }


////        정렬 : nlon(n)
//        List<int[]> myList1 = new ArrayList<>();
//        Arrays.sort(nums);
//        int first = 0;
//        int last = nums.length-1;
//        for (int i = 0; i < nums.length; i++) {
//
//            int sum = nums[first] + nums[last];
//            if(sum == target){
//                myList1.add(new int[]{nums[first], nums[last]});
//                first ++;
//                last --;
//            } else if (sum>target) {
//                last --;
//            }else {
//                first ++;
//            }
//        }
//        while(first<last){
//            int sum = nums[first] + nums[last];
//            if(sum == target){
//                myList1.add(new int[]{nums[first], nums[last]});
//                first ++;
////                last --;
//            } else if (sum>target) {
//                last --;
//            }else {
//                first ++;
//            }
//        }
//        for (int[] a : myList1){
//            System.out.println(Arrays.toString(a));
//        }


//        int[] nums = {7, 8, 9, 2, 4, 5, 1, 3, 6}; // (7,3),(8,2),(6,4),(9,1)...
//        int target = 10;
////        구간의 합이 target이 되는 배열의 index의 처음과 끝을 리스트에 담기
//        List<int[]> myList2 = new ArrayList<>();
////        Arrays.sort(nums);
//        int start = 0;
//        int end = 0;
//        while (end < nums.length && start < nums.length) {
//            int sum = nums[start] + nums[end];
//            if (sum == target) {
//                myList2.add(new int[]{start, end});
//                if (end == nums.length - 1) {
//                    start++;
//                }else {
//                    end++;
//                }
//            } else if (sum < target) {
//                if (end == nums.length - 1) {
//                    start++;
//                } else {
//                    end++;
//                }
//            } else {
//                if (end == nums.length - 1) {
//                    start++;
//                } else {
//                    end++;
//                }
//
//            }
//        }
//        for (int[] a : myList2) {
//            System.out.println(Arrays.toString(a));
//        }






        int[] nums = {7, 8, 9, 2, 4, 5, 1, 3, 6};
        int target = 10;
//        구간의 합이 target이 되는 배열의 index의 처음과 끝을 리스트에 담기
        List<int[]> myList2 = new ArrayList<>();
//        Arrays.sort(nums);
        int start = 0;
        int end = 0;
        int sum = nums[0];

        while (end < nums.length) {
            if (sum == target) {
                myList2.add(new int[]{start, end});
                sum -= nums[start];
                start++;
            } else if (sum < target) {
                end++;
                if (end < nums.length) {
                    sum += nums[end];
                }
            } else {
                sum -= nums[start];
                start++;
            }
        }
        for (int[] a : myList2) {
            System.out.println(Arrays.toString(a));
        }
    }
}
