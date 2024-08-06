import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int[][] metrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int target = 49;

        System.out.println(Arrays.toString(metrixSearch(metrix, target)));
    }

    public static int[] metrixSearch(int[][] metrix, int target){
        int row = 0;
        int col = metrix.length - 1;

        while(row < metrix.length && col >= 0){
            if(metrix[row][col] == target){
                return new int[]{row, col};
            }
            else if(metrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        } 

        return new int[]{-1,-1};
    }
}