import java.util.*;
import java.text.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pay=sc.nextDouble();
        Locale india=new Locale("en","IN");
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(pay));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(india).format(pay));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(pay));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(pay));
    }
}