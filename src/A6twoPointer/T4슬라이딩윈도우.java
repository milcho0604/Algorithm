package A6twoPointer;

public class T4슬라이딩윈도우 {
    public static void main(String[] args) {
//        정수 배열 nums와 정수 k가 주어졌을때
//        길이가 k인 연속된 부분 배열의 최대합을 구하기
//        int nums[] = {1,4,2,10,23,3,1,0,20};
        int nums[] = {10,20,30,40,50,60,70};

        int k =4 ;
        int result = Integer.MIN_VALUE;
        int sum= 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
        for(int i=k; i<nums.length; i++){
            System.out.println("sum값 = "+sum);
            sum += nums[i] - nums[i-k];
            System.out.println("i값 = "+nums[i]);
            System.out.println("i-k값 = "+nums[i-k]);

            System.out.println(sum);
            result = Math.max(result,sum);
        }
//        System.out.println(result);
    }
}
