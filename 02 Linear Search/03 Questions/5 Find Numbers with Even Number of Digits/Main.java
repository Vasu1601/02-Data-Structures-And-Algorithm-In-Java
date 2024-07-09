// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
import java.lang.Math;

class Main{
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for(int n: nums){
            if(even(n)){
                count++;
            }
        }

        return count;
    }

    public static boolean even(int n){
        if(len(n)%2 == 0){
            return true;
        }
        return false;
    }

    // public static int len(int n){
    //     int count = 0;

    //     while(n!=0){

    //         count++;
    //         n =n/10;
    //     }

    //     return count;
    // }

    public static int len(int n){

        //Math.log10 help to reduce the time complexity because here we don't need to run any loop
        return (int)(Math.log10(n)) + 1;
    }
}

