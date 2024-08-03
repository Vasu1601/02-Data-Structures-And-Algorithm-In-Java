// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

class Main{
    public static void main(String[] args){
        // int[] arr = {15, 18, 2, 3, 6, 12};
        int[] arr = {7, 9, 11, 12, 5};

        int pivot = findPivot(arr);

        int ans = pivot + 1;
        System.out.println(ans);
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
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}