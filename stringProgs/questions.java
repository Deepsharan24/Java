import java.util.*;
public class questions {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        // 4 reverse string
        
        String reverse="";
        for (int i = name.length()-1 ; i >=0; i--) {
            reverse =  reverse + name.charAt(i); 
        }
        System.out.println(reverse);



        // 3
        // String email = sc.next();
        // String userName = "";
        // for(int i=0; i<email.length(); i++) {
        // if(email.charAt(i) == '@') {
        // break;
        // } else {
        //     userName += email.charAt(i);
        // }

        
        
        
        // 2
        // String user=sc.next();
        // String result="";

        // for(int i=0; i<user.length(); i++){
        //     if (user.charAt(i) == 'e'){
        //         result =result + "i";

        //     }
        //     else{
        //         result = result + user.charAt(i);
        //     }
        // }
        // System.out.println(result);

        // 1
        // String arr[]= new String[size];
        // int totlength=0;

        // for (int i=0; i<size; i++){
        //     arr[i]=sc.next();
        //     totlength+=arr[i].length();
        // }
        // System.out.println(totlength);
    }
    // System.out.println(userName);
}



