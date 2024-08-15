import java.util.*;

class Main{
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};

        selection(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr, 0, last);

            swap(arr, maxIndex, last);
        }
    }

    public static int getMax(int[] arr, int start, int last){
        int max = start;
        for(int i = start; i<=last; i++){
            if(arr[i] > arr[max]){
                max = arr[i];
            }
        }

        return max;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}