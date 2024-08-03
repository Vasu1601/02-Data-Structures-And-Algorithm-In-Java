//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

class Main{
    public static void main(String[] args){

        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};//In this case we may get indexout of bound error but in case of infinite array you can never get index out of bound error 
        int target = 170;

        int desiredAns = ans(arr, target);

        System.out.println(desiredAns);

    }

    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;

            end = end + (end - start + 1)*2;
            
            // if(end >= arr.length){
            //     end = arr.length - 1;
            // }
            
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
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