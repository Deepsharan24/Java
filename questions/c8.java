import java.util.*;
public class c8 {
    public static double powerNum (int x,int n){
        // int result =0;
        for (int i = 1; i < n; i++){
            x=x*n;
        }
        // return Math.pow(x,n);
        return x;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int n= sc.nextInt();

        System.out.println("Power of Number is : "+ powerNum(x, n));
    }
}
