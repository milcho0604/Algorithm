package A5dp;

import java.sql.PseudoColumnUsage;
import java.util.Arrays;

public class D3점수삼각형 {
    public static void main(String[] args) {
        int[][] triangle =
                             {{7},
                            {3, 8},
                           {8, 1, 0},
                          {2, 7, 4, 4},
                        {4, 5, 2, 6, 5}};

//        가변배열이라 비워두기
        int[][] dp =new int[triangle.length][];
        dp[0] = Arrays.copyOf(triangle[0], triangle[0].length);

        for(int i=0; i<triangle.length-1; i++ ){
            dp[i+1] = new int[triangle[i+1].length];
            for(int j=0; j<triangle[i].length; j++){
                if(dp[i][j] + triangle[i+1][j] > dp[i+1][j]){
                    dp[i+1][j] = dp[i][j] + triangle[i+1][j];
                }
                if(dp[i][j] + triangle[i+1][j+1] > dp[i+1][j+1]){
                    dp[i+1][j+1] = dp[i][j] + triangle[i+1][j+1];
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        int max = 0;


//        dp[0][0] = triangle[0][0];
//        dp[1][0] = dp[0][0] + triangle[1][0];
//        dp[1][1] = dp[0][0] + triangle[1][1];
//
//        dp[2][0] = triangle[1][0];
//        dp[2][1] = Math.max(dp[1][0] + triangle[2][1], triangle[1][1] + dp[2][1]);
//
//        dp[3][1] = Math.max(triangle[2][0] + dp[3][1], triangle[2][1] + dp[3][1]);
//        dp[3][2] = Math.max(triangle[2][1] + dp[3][2], triangle[2][2] + dp[3][2]);
//
//        for(int i=3; i< dp.length; i++){
//            for (int j = 3; j < dp[0].length; j++) {
//                dp[i][j] =Math.max(triangle[i][j] + dp[i][j], triangle[i][j+1] + dp[i][j]);
//
//            }
//        }
//        System.out.println(Arrays.toString(dp));

//         dp[1][0] = dp[0][0] + triangle[1][0];
//         dp[1][1] = dp[0][0] + triangle[1][1];
//
//         dp[2][0] = triangle[1][0];
//         dp[2][1] = Math.max(dp[1][0] + triangle[2][1], triangle[1][1] + dp[2][1]);
//
//         dp[3][1] = Math.max(triangle[2][0] + dp[3][1], triangle[2][1] + dp[3][1]);
//         dp[3][2] = Math.max(triangle[2][1] + dp[3][2], triangle[2][2] + dp[3][2]);

//        int[][] arr =
//                {{7},
//                        {3, 8},
//                        {8, 1, 0},
//                        {2, 7, 4, 4},
//                        {4, 5, 2, 6, 5}};
//        int[][] arr1 =new int[triangle.length][triangle[0].length];
//        int[] arr2 =new int[triangle.length];
//        arr1[0][0] = 7;
//        arr1[1][0] = 3;
//        arr1[1][1] = 8;
//        arr1[2][0] = 8;
//        arr1[2][1] = 1;
//        arr1[2][2] = 0;
//
//        arr2[0] = arr1[0][0] + arr1[1][0];  // 10
//        arr2[1] = arr1[0][0] + arr1[1][1];  // 15
//
//        arr2[2] = arr2[0] + arr1[2][0];     // 18
//        arr2[3] = arr2[1] + arr1[2][1];     // 11
//
//        arr2[4] = arr2[0] + arr1[2][0];     // 16
//        arr2[5] = arr2[1] + arr1[2][2];     // 15

    }
}
