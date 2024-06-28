//package A7binarySearch;
//
//import java.util.Arrays;
//
//public class B1Basic {
//    public static void main(String[] args) {
////        이분탐색은 사전에 정렬이 되어 있어야 가능한 알고리즘
//        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
//        int target = 17;
//        int left = 0;
//        int right = arr.length-1;
//        int answer=0;
//        Arrays.sort(arr);
//        while(left<right){
////            int mid = (left+right)/2;
//            int mid = (arr[left]+arr[right])/2;
//            if(mid<target){
//                left++;
//            }else {
//                right++;
//            }
//            if(mid == target){
//                answer = mid;
//                break;
//            }
//        }
//        System.out.println(answer);
//
//    }
//}


package A7binarySearch;

import java.util.Arrays;

public class B1Basic {
    public static void main(String[] args) {
//        이분탐색은 사전에 정렬이 되어 있어야 가능한 알고리즘
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 17;
        int left = 0;
        int right = arr.length-1;
        int answer=0;
        Arrays.sort(arr);
        while(left<=right){
            int mid = (left+right)/2;
//            int mid = (arr[left]+arr[right])/2;   // 이건 인덱스 값이 아닌 실제 값
            if(arr[mid]<target){
                left = mid+1;
            }else {
                right = mid-1;
            }
            if(arr[mid] == target){
                answer = mid;
                break;
            }
        }
        System.out.println(Arrays.binarySearch(arr, 17));
        System.out.println(answer);
    }
}
