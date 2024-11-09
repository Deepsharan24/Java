import java.util.*;
public class aa {
    public static boolean ageEligible(int x) {
        if (x>=18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(ageEligible(n));
    }
}
