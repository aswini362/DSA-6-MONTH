package dsa.LeetCode.Arrays.SubArrays;

public class MaximumSubarray {

    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }

        }
        return maxSum;
    }

    public static int KadaneAlgo(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return maxSum;
    }
    public static void kadaneWithSubarray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0, tempStart = 0, end = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }
        System.out.println("Maximum Sum: " + maxSum);
        System.out.print("Subarray: [ ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
    }

}
