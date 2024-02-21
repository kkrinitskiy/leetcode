package org.example;

public class MaxOperations {
    public static int maxOperations(int[] nums) {

        int count = 1;
        int sum = nums[0] + nums[1];
        for(int i = 2; i<nums.length-1; i++){
            if(nums[i] + nums[i+1] == sum){
                count++;
                i++;
            }else {
                break;
            }
        }
        return count;

    }
}
