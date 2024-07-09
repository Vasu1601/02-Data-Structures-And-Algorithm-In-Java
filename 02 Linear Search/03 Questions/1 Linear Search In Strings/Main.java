import java.util.*;

class Main{
    public static void main(String[] args){

        String name = "Vassu Mehta";
        char target = 'u';

        int ans = linearSearch(name, target);
        System.out.println(ans);
    }

    // public static int linearSearch(String str, char target){

    //     char[] arr = str.toCharArray();

    //     for(int i = 0; i<arr.length; i++){
    //         if(arr[i] == target){
    //             return i;
    //         }
    //     }

    //     return -1;

    // }

    public static int linearSearch(String str, char target){

        for(int i =0; i<str.length(); i++){

            if(str.charAt(i) == target){
                return i;
            }

        }

        return -1;

    }
}

/* 
======================================================================Notes======================================================================

In the code above, you can use either method to search for a character in a string. 

The first method (commented out) converts the string into a char array and then searches through the array.
The second method (uncommented) uses the charAt method to directly access characters in the string.

Both methods achieve the same result. Choose the one that you find more convenient or that fits the requirements of your problem.

Important Points:
- When working with strings, use str.length() to get the length of the string.
- When working with arrays, use arr.length to get the length of the array.

=================================================================================================================================================
*/