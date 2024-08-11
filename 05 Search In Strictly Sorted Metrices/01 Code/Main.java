import java.util.*;

class Main{
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        int target = 11;

        System.out.println(Arrays.toString(searchMatrix(arr, target)));
    }

    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            } else if(matrix[row][mid] < target){
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }

    public static int[] searchMatrix(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; 

        if(rows == 0 || cols == 0) return new int[]{-1, -1};

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            } else if(matrix[mid][cMid] < target){
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have only two rows remaining, rStart and rStart + 1

        // Check the target in the middle column of the two remaining rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }

        // Search in 4 parts:
        // Part 1: top left
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // Part 2: top right
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // Part 3: bottom left
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        // Part 4: bottom right
        return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
    }
}
