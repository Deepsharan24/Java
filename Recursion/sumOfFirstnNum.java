import java.util.*;
public class sumOfFirstnNum{
    public static void sumOfN(int x,int n,int sum){
        if (x==n){
            sum+=x;
            System.out.println(sum);
            return;
        }

        sum+=x;
        sumOfN(x+1,n,sum);
        System.out.println(x);
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Give number N: ");
        int n = sc.nextInt();

        int x=1;
        sumOfN(x,n,0);   
    }
}