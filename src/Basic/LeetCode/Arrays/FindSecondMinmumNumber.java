package Basic.LeetCode.Arrays;

public class FindSecondMinmumNumber {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 8, 1, 3};
        int[] arr2 = {7, 7, 7, 7};
        int[] arr3 = {4, 1, 2, 2, 3};

        System.out.println(findSecondMin(arr1)); // ✅ 2
        System.out.println(findSecondMin(arr2)); // ✅ -1 (no second minimum)
        System.out.println(findSecondMin(arr3)); // ✅ 2
    }

    public static int findSecondMin(int[] nums) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;
            }

        }

        return (secondMin == Integer.MAX_VALUE) ? -1 : secondMin;
    }
}
