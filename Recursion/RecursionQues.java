import java.util.Scanner;

public class RecursionQues {
    public static void repeat(int x,int end){

        if (x>end){
            return;
        }
        System.out.print(x);
        repeat(x+1,end);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give your limit: ");
        int end=sc.nextInt();

        int x=1;

        repeat(x,end);  
    }

}
