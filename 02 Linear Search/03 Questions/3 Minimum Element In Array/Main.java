class Main{
    public static void main(String[] args){

        int[] arr = {12, 5, 10, 15, 31, 20, 25, 2, 40};

        int ans = findMin(arr);

        System.out.println(ans);

    }

    public static int findMin(int[] arr){

        int min = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min;
        
    }
}