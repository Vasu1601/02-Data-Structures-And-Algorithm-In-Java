// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

//this is only applicable if there are no duplicates
class Main{
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2}; 
        int target = 4;

        int pivot = findPivot(arr);
        
       if(pivot == -1){
        //normal Binary Search
        int ans = binarySearch(arr, target, 0, arr.length-1);
       }
       if(arr[pivot] == target){
        System.out.println(pivot);
       }
       else if(target >= arr[0]){
        int ans = binarySearch(arr, target, 0, pivot);
        System.out.println(ans);
       }
       else{
        int ans = binarySearch(arr,target, pivot + 1, arr.length - 1);
        System.out.println(ans);
       }
    }

    public static int findPivot(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            else if(arr[start] > arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target<arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}