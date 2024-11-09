public class stack_height_logn {
    public static int calPower(int x , int n){
        if (n==0){    //base case 1
            return 1;
        }
        if (x==0){     //base case 2
            return 0;
        }
        // if n is even
        if (n%2==0){
            return calPower(x, n/2) *calPower(x, n/2);
        }
        else{ // nis odd
            return calPower(x, n/2) *calPower(x, n/2) * x; 
        }
    }
    public static void main(String args[]){
        int x=2 , n=5;
        int ans = calPower(x,n);
        System.out.println(ans);
    }
}
