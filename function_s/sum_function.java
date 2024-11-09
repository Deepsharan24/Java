import java.util.*;
public class sum_function {
    public static int productOfTwoNumbers (int x, int y){
        int product = x*y;
        // System.out.println(sum);
        return product;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int product = productOfTwoNumbers(x, y);
        System.out.println("product of 2 numbers: "+product);
    }
}