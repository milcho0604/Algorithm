package A5dp;

import java.util.Arrays;

public class D2멀리뛰기 {
    public static void main(String[] args) {
//        기억하기 방식(중복연산이 발생하지 않음)
        int n =4;

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for(int i=2; i<n; i++){
            arr[i] = arr[i - 1]%1234567 + arr[i - 2]%1234567 ;
        }
        System.out.println(Arrays.toString(arr));

    }
}


//    //        기억하기 방식(중복연산이 발생하지 않음)
//    int n = 4;
//    //        식 : f(n) = f(n-1) + f(n-2)
//    int[] arr = new int[n + 1];
//        arr[1]=1;
//                arr[2]=2;
//                for(int i=3;i<=n;i++){
//                arr[i]=arr[i-1]+arr[i-2];
//                }
//                System.out.println(Arrays.toString(arr));