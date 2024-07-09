import java.util.*;

class Main{
    public static void main(String[] args){

        int[][] arr = {
            {23, 56, 78},
            {59, 33, 46, 97},
            {19, 81, 70},
            {91, 89}
        };
        int target = 81;

        int[] ans = linearSearch(arr, target);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] linearSearch(int[][] arr, int target){

        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1,-1};
    }

}