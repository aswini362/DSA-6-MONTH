package Basic.LeetCode.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 8, 13, 11};
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(" " + num);

        }

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean isSwapped;
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }

        }

    }
}
