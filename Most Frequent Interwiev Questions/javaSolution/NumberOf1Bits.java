package javaSolution;
/*
Write a function that takes the binary representation of an unsigned
integer and returns the number of '1' bits it has (also known as the
Hamming weight).

Note:

    Note that in some languages, such as Java, there is no unsigned
    integer type. In this case, the input will be given as a signed
    integer type. It should not affect your implementation, as the
    integer's internal binary representation is the same, whether it
    is signed or unsigned.

    In Java, the compiler represents the signed integers using 2's
    complement notation. Therefore, in Example 3, the input represents
    the signed integer. -3.
 */
public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(numberOfOneBits(0b00000000000000000000000000001011));
        System.out.println(numberOfOneBits(0b00000000000000000000000010000000));
        System.out.println(numberOfOneBits(0b11111111111111111111111111111101));
    }

    public static int numberOfOneBits(int n) {
        int result = 0;
        while (n != 0) {
            n &= (n - 1);
            result++;
        }
        return result;
    }
}
