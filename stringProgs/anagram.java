import java.util.*;
public class anagram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the string s: ");
        String s = sc.nextLine();
        System.out.println("Give the string t: ");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);
        System.out.println(result);
    }
        public static boolean isAnagram(String s,String t) {

            if (s.length()!= t.length()){
                return false;
            }
            char [] sArr = s.toCharArray();
            char [] tArr = t.toCharArray();
            
            Arrays.sort(sArr);
            Arrays.sort(tArr);
            
            for (int i = 0; i < sArr.length; i++){
                if (sArr[i] != tArr[i]){
                    return false;
                }
            }
            return true;
        }
    }

