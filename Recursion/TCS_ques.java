import java.util.*;
public class TCS_ques{
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int c=0;

        for (int i = 0; i<n.length(); i++){
            if (c>=3){
                System.out.println(c);
                System.out.println(true);
                break;
            }
            if ((n.charAt(i))%2==0){
            }
            else{
                c++;
            }
        }
        return;
    }
}