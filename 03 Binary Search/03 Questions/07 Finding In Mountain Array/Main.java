//https://leetcode.com/problems/find-in-mountain-array/description/
class Main{
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        int target = 4;

        int peak = findPeakIndex(arr);
        int firstSearch = orderAgnosticBinarySearch(arr, target, 0, peak);
        if(firstSearch != -1){
            System.out.println(firstSearch);
        }
        else{
            int secondSearch = orderAgnosticBinarySearch(arr, target, peak+1, arr.length -1);
            System.out.println(secondSearch);
        }

    }

    public static int findPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
        }
        return start;
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){
       boolean isAcc = arr[start]<arr[end];

       while(start <= end){
        int mid = start + (end - start)/2;

        if(isAcc){
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }else{
            if(target < arr[mid]){
              start = mid + 1;  
            }
            else if(target > arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
       }

       return -1;
    }
}