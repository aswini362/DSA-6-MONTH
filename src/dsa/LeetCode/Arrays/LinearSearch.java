package dsa.LeetCode.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        int target=10;
        System.out.println(findElement(arr,target));

    }

    public static boolean findElement(int [] arr,int target){
        boolean isFound=false;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                isFound=true;
            }
        }
        return isFound;
    }
}
