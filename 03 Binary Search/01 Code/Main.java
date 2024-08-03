import java.util.*;

class Main{
    public static void main(String[] args){
        int[] arr = {-23, -14, 3, 5, 12, 14, 29, 45, 63, 74, 79, 88};
        int target = 155;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}