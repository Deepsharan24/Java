// package BitManipulation;

public class updateBit {
    public static void main(String args[]){
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        // For 1
        int newNumber = bitMask|n ;
        System.out.println(newNumber);

        // For 0
        int notBitMask = ~(bitMask);
        int notNewNumber = bitMask & notBitMask ;
        System.out.println(notNewNumber);

    }
    
}
