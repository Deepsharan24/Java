import java.util.*;

public class condition {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Write your age");
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("Person is adult");
        }
        else if(age < 18) {
            System.out.println("Person is not adult");
        }
    }
}
