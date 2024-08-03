//Order Agnostic Binary Search means which run for Accesnding order as well as decending order

class Main{
    public static void main(String[] args){
        int[] arr = {78, 65, 63, 49, 37, 27, 21, 9, 5, -15, -23};
        int target = 65;

        int ans = orderAgnosticBinarySearch(arr, target);

        System.out.println(ans);
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAcc = arr[start]<arr[end];

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAcc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}