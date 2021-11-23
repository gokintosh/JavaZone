package LEETCODE;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {

    public static int findMissingNumber(int[] nums){
//        return IntStream.rangeClosed(0,nums.length).sum()- Arrays.stream(nums).sum();
        nums= Arrays.stream(nums).sorted().toArray();

        for(int i=0;i<=nums.length;i++){
            if((i^nums[i])!=0){
                return i;
            }
        }

        return -1;


    }


    public static void main(String[] args) {

        int[] nums={0,1};
        System.out.println(findMissingNumber(nums));


    }
}
