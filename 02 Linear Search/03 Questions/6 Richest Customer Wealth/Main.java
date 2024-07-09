// https://leetcode.com/problems/richest-customer-wealth/description/

import java.util.*;

class Main{
    public static void main(String[] args){
        int[][] accounts = {
            {1, 5},
            {7, 3},
            {3, 5}
        };

        int ans = maximumWealth(accounts);

        System.out.println(ans);
    }

     public static int maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;

        for(int[] account: accounts){
            int sum = 0;

            for(int balance: account){
                sum = sum + balance;
            }

            if(sum > max){
                max = sum;
            }
        }

        return max;
    }
}