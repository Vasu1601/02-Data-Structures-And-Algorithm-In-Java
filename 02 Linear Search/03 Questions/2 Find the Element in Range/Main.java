class Main{
    public static void main(String[] args){

        int[] arr = {12, 5, 10, 15, 31, 20, 25, 2, 40};
        int target = 15;

        int ans = linearSearch(arr, target, 1, 5);

        System.out.println(ans);
    }

    public static int linearSearch(int[] arr, int target, int start, int end){

        for(int i = start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
        
    }
}