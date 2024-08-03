class Main{
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 9, 9, 1, 2, 2};
        int target = 4;
        
        int pivot = findPivot(arr);

        int firstAns = binarySearch(arr, target, 0, pivot);
        if(firstAns == -1){
          int secondAns = binarySearch(arr, target, pivot+1, arr.length - 1);
          System.out.println(secondAns);  
        }
        else{
            System.out.println(firstAns);
        }
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid]>arr[mid + 1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1 ;
            }
            else if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start]>arr[start + 1]){
                    return start;
                }
                start++;

                if(arr[end] < arr[end -1]){
                    return end - 1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[end] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        } 

        return -1;
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