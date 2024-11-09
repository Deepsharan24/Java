public class compare {
    public static void main(String[] args){
        String name1="skywalker";
        String name2="skywalker";

        // compare 2 strings 

        // compare with 3 case 
        // 1  string1 > s2 : +ve value 
        // 2  s1 == s2 : 0
        // 3  s1 < s2 : -ve value

        if (name1.compareTo(name2) == 0 ){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
    }
}
