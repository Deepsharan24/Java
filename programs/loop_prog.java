import java.util.*;

public class loop_prog {
    public static void main(String[] args){
        System.out.print("Give the N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum= N * i;
            System.out.println(N +" * " + i + " = " + sum);
        }
    } 
}
