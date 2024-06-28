package A7binarySearch;

import java.util.Arrays;
import java.util.Map;

public class B2Basic2 {
    public static void main(String[] args) {
//        target을 찾되,
//        target이 없으면 target큰 값중에 첫번째 값의 index를 찾아라
        int arr[] = {1, 3, 4, 5, 7, 8, 9};
        int target = 6;
        int left = 0;
        int right = arr.length - 1;
        int answer = -1;
        Arrays.sort(arr);

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= target) {
                answer = mid;
                right = mid - 1;
            } else if(arr[mid] < target) {
                left = mid + 1;
            }
        }
        System.out.println(answer);
        System.out.println(arr[answer]);
//        더 간단한 방법
        int answer2 = Arrays.binarySearch(arr, target);
        if(answer2<0){
            System.out.println(Math.abs(answer2)-1);    // 인덱스의 위치 리턴 -1을 해주면 가장 가까운 큰 값
        }else {                                         // 인덱스의 위치 리턴 -2를 해주면 가장 가까운 작은 값
            System.out.println(answer2);
        }
//        가까운 값 찾기
        int[] arr2 = {10,20,30};
        System.out.println(Arrays.binarySearch(arr2, 35));
        System.out.println(Arrays.binarySearch(arr2, 25));
        System.out.println(Arrays.binarySearch(arr2, 9));


    }
}
