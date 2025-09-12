import java.util.*;
import java.math.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger n=new BigInteger(sc.next());
        System.out.println(n.isProbablePrime(10)?"prime":"not prime");
    }
}