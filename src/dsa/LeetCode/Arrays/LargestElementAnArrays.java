package dsa.LeetCode.Arrays;

public class LargestElementAnArrays {

    public static void main(String[] args) {
        int [] arr={10,20,40,50,30};
        System.out.println(findLargestElement(arr));

    }

    public static int findLargestElement(int [] arr){
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
}
