// https://leetcode.com/problems/split-array-largest-sum/description/

import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {7,2,5,10,8};
        int k = 2;

        int ans = splitArray(arr, k);
        System.out.println(ans);
    }

    public static int splitArray(int[] arr, int k) {
        int start = arr[0];
        int end = 0;

        for(int n: arr){
            start = Math.max(start, n);
            end = end + n;
        }

        while(start < end){
            int mid = start + (end - start)/2;

            int sum = 0;
            int pieces = 1;

            for(int n: arr){
                if(sum + n >mid){
                    sum = n;
                    pieces++;
                }
                else{
                    sum = sum + n;
                }
            }

            if(pieces>k){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }

        return end;
    }
}