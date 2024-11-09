import java.util.*;

public class concatenation{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName = firstName + lastName;
        System.out.println(fullName);


        // length method
        System.out.println( fullName.length());

        
        // charAt method  // ittrate at every letter of string
        for(int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

    }
}