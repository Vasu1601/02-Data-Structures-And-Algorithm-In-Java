import java.util.*;

class Main{

    public static void main(String[] args){

        int[] arr = {1,56,77,14,18};
        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

}

/* 
======================================================================Notes======================================================================

The purpose of the reverse method is to reverse the order of the elements in the array. To do this, the method uses two pointers, start and end. 
start is initialized to the beginning of the array (index 0), and end is initialized to the last index of the array (arr.length - 1). The method 
then enters a while loop that continues until start is no longer less than end.

Inside the while loop, the swap method is called to exchange the elements at the start and end indices. The swap method takes the entire array 
and two indices as arguments. It uses a temporary variable temp to hold the value at the start index while the element at the end index is 
to the start index. Then, the value stored in temp is assigned to the end index. After swapping, the start index is incremented by one, and the 
end index is decremented by one, gradually moving towards the center of the array.

The reason for passing the entire array along with the indices to the swap function, rather than just passing the elements directly, is crucial 
for modifying the original array. In Java, when we pass primitive data types (like int) to a method, they are passed by value, meaning only a 
copy of the value is passed, not the actual variable. However, when we pass an array, even though it seems like we are passing it by value, 
the reference to the array is actually passed, allowing the method to modify the original array. If we only passed the values of arr[start] 
and arr[end], the swap function would only be able to swap the values of these copies, and the original array would remain unchanged. By passing 
the whole array and the indices, the swap function can directly access and alter the original elements of the array, ensuring the intended 
modification.

Finally, after the reverse method completes, the main method prints the reversed array using Arrays.toString(arr), which converts the array into 
a readable string format. This displays the reversed array as [18, 14, 77, 56, 1] in the console.

=================================================================================================================================================
*/