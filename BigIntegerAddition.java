import java.math.BigInteger;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger c = sc.nextBigInteger();
        BigInteger d = sc. nextBigInteger();

        System.out.println(c.add(d));
        System.out.println(c.multiply(d));

        sc.close();
    }
}