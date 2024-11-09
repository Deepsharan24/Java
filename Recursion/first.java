public class first{
    public static void printNumber(int x){
        if (x==0){     // base
            return;
        }
        System.out.println(x); // print

        printNumber(x-1);      // recursion
    }
    public static void main(String[] args){
        int x=5;
        printNumber(x);
    }
}