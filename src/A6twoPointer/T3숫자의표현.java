package A6twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T3숫자의표현 {
    public static void main(String[] args) {
        int n = 15;
        List<int[]> myList = new ArrayList<>();
        int[] nums = new int[n];

        for (int i =0; i < nums.length; i++) {
            nums[i] = i+1;
        }
//        System.out.println(Arrays.toString(nums));

        int start = 0;
        int end = 0;
        int sum = nums[0];
        int count =0;
        while (end < nums.length) {
            if (sum == n) {
                myList.add(new int[]{start, end});
                count ++;
                sum -= nums[start];
                start++;
            } else if (sum < n) {
                end++;
                if (end < nums.length) {
                    sum += nums[end];
                }
            } else {
                sum -= nums[start];
                start++;
            }
        }
//        for (int[] a : myList) {
//            System.out.println(Arrays.toString(a));
//        }
        System.out.println(count);
//        for (int[] a : myList) {
//            System.out.println(Arrays.toString(a));
//        }
    }
}



class Solution {
    public int solution(int n) {
        int[] nums = new int[n];

        for (int i =0; i < nums.length; i++) {
            nums[i] = i+1;
        }

        int start = 0;
        int end = 0;
        int sum = nums[0];
        int count =0;
        while (end < nums.length) {
            if (sum == n) {
                count ++;
                sum -= nums[start];
                start++;
            } else if (sum < n) {
                end++;
                if (end < nums.length) {
                    sum += nums[end];
                }
            } else {
                sum -= nums[start];
                start++;
            }
        }
        return count;
    }
}
