// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

class Main{
    public static void main(String[] args){

        int[] arr = {1, 4, 5, 6, 5, 3, 1};
        int peakIndex = findPeakIndex(arr);

        System.out.println(peakIndex);
    }

    public static int findPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
        }
        return start;
    }
}