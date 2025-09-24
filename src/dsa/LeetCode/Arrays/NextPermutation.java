package dsa.LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {

    public static void main(String[] args) {


    }

    public static void nextPermutation(int[] nums){
        int n=nums.length;
        int i=n-2;
        while (i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if (i>=0){
            int j=n-1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }


    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left++, right--);
        }

    }
}
