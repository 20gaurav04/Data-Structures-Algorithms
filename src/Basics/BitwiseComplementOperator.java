package Basics;

public class BitwiseComplementOperator {
    public static void main(String[] args) {
        int a =  6;
//        so 6 in 32 bits is 00000000 00000000 00000000 00000110
//        its complement will be 11111111 11111111 11111111 1111001
//Operand Conversion: The operand is converted to a 32-bit integer.
//Bit Inversion: Each bit in the 32-bit representation is inverted.
//Result: The result is the new 32-bit integer with the inverted bit
    System.out.println(" ~a :"+ ~a);
    }
}
