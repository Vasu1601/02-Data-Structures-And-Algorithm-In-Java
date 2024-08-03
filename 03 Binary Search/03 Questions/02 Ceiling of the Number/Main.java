class Main{
    public static void main(String[] args){
        int[] arr = {5, 9, 15, 18, 27, 41, 56, 63, 77, 83, 85, 99};
        int target = 84;

        int ans = findCeiling(arr, target);
        System.out.println(ans);
    }

    public static int findCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        if(start > arr.length - 1){
            return -1;
        }

        return arr[start]; 
    }
}