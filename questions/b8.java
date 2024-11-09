import java.util.*;
public class b8 {
    public static void main(String args[]) {
        int positive=0;
        int negative=0;
        int zeros=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to continue or 0 to stop: ");
        int select = sc.nextInt();

        while (select == 1){
            System.out.println("Give Your number: ");
            int number = sc.nextInt();
            if (number>0){
                positive++;
            }
            else if (number<0){
                negative++;
            }
            else {
                zeros++;
            }

            System.out.println("Press 1 to continue or 0 to stop: ");
            select = sc.nextInt();
        }
 
        System.out.println("Positives : "+ positive);
        System.out.println("Negatives : "+ negative);
        System.out.println("Zeros : "+ zeros);
    }   
 }
 

