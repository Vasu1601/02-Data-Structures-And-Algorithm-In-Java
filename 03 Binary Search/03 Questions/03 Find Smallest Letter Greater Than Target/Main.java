//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

class Main{
    public static void main(String[] args){
        char[] arr = {'c','f','j'};
        char target = 'j';

        char ch = nextGreatestCharacter(arr, target);
        System.out.println(ch);
    }

    public static char nextGreatestCharacter(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}