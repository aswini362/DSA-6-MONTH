package Basic.LeetCode.Arrays;

public class SecondLargestElementOfAnArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        secondLargestElement(arr);
        System.out.println(findSecondLargest(arr));
    }

    //case one if there is no duplicates
    public static void secondLargestElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        System.out.println(" " + arr[1]);

    }

    //case where duplicate element are there
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }
}
