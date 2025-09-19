package dsa.LeetCode.Arrays;

public class FindMinimumNumber {
    public static void main(String[] args) {
        int[] nums = {3, 7, 6, 8, 2};
        findMinNumber(nums);
        System.out.println(findMin(nums));
    }

    public static void findMinNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(arr[0]);

    }

    // better approached
    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
        }
        return min;

    }
}
