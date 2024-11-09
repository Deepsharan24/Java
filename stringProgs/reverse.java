import java.util.*;

public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        StringBuilder sb = new StringBuilder(name);

        for (int i = 0; i < name.length()/2; i++){
            
            int front = i;
            int back = name.length()-1-i;

            char frontChar = name.charAt(front);
            char backChar = name.charAt(back);
            
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.print(sb);
    }
}
