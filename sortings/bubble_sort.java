public class bubble_sort{
    public static void printSort(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
        public static void main(String args[]){
        int arr[]={7,8,1,2,3};
        
        //Bubble sort 
        // Time complexity = O(n^2)

        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printSort(arr);
    }
}