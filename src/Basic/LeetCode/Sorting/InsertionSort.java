package Basic.LeetCode.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5, 8, 6};
        insertionSort(arr);
        for (int num : arr) {
            System.out.print(" " +num);
        }

    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }

    }
}
