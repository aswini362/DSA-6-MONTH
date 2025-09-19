package dsa.LeetCode.Arrays;

public class MoveZerosAtTheEnd {
    public static void main(String[] args) {

    }

    public static void moveZeros(int nums[]) {
        int n = nums.length;
        int lastNonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        for (int i = lastNonZeroIndex; i < n; i++) {
            nums[i] = 0;
        }

    }

    public static void swapMethod(int[] nums) {
        int n = nums.length;
        int lastNonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex] = nums[i];
                nums[i] = temp;
                lastNonZeroIndex++;

            }
        }
    }

}
