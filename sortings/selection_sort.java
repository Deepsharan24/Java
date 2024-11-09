public class selection_sort {
    public static void printSort(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        
        // Selection sort 
        // Time complexity = O(n^2)
        
        int arr[] = {7,8,2,3,1,5,4,9,5,1,55,4,6,3,5,9,5,95};
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length;j++){
                if (arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        printSort(arr);
    }
}
