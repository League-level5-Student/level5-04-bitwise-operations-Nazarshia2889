package _03_Printing_Binary;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */


    public void printByteBinary(byte b) {
        // We first want to print the bit in the one's place

        // Shift b seven bits to the right

        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1
    	for(int i = 7; i >= 0; i--) {
    		byte x = b;
	    	System.out.print((x >> i) & 1);
    	}
    	

        // Print the result using System.out.print (NOT System.out.println)

        //Use this method to print the remaining 7 bits of b
    }

    public void printShortBinary(short s) {
        // Create 2 byte variables
    	byte a = 0;
    	byte b = 0;
    	

        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte

        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    	byte x = (byte) (s >> 8);
    	
		a = (byte) (a | x);
		printByteBinary(a);
		
		System.out.println();
		
		b = (byte) (b | s);
		printByteBinary(b);
;    			
    }

    public void printIntBinary(int i) {
        // Create 2 short variables
    	short a = 0;
    	short b = 0;

        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short
    	short x = (short) (i >> 16);
    	
    	a = (short) (a | x);
    	printShortBinary(a);
    	
    	System.out.println();
    	
    	b = (byte) (b | i);
    	printShortBinary(b);

        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    }

    public void printLongBinary(long l) {
        // Use the same method as before to complete this method
    	int a = 0;
    	int b = 0;

        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short
    	int x = (int) (l >> 32);
    	
    	a = (int) (a | x);
    	printIntBinary(a);
    	
    	System.out.println();
    	
    	b = (int) (b | l);
    	printIntBinary(b);
    }

    public static void main(String[] args) {
        // Test your methods here
    	byte b = (byte) 0b00111111;
    	short s = 0b0000111010101010;
    	int i = 54;
    	long l = 103429;
    	
    	_01_BinaryPrinter bp = new _01_BinaryPrinter();
    	bp.printByteBinary(b);
    	System.out.println();
    	System.out.println();
    	bp.printShortBinary(s);
    	System.out.println();
    	System.out.println();
    	bp.printIntBinary(i);
    	System.out.println();
    	System.out.println();
    	bp.printLongBinary(l);
    }
}
