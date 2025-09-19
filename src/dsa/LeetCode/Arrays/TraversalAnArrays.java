package dsa.LeetCode.Arrays;

public class TraversalAnArrays {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);

        }
        System.out.println("-------- ");
        int n = arr.length;
        int i=0;
        while (i<n){
            System.out.print(arr[i]+" ");
            i++;
        }
        for(int arrs: arr){
            System.out.print(" "+arrs);
        }
    }
}
