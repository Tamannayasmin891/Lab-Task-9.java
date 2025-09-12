import java.math.*;
import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        for(int i=0;i<n;i++) s[i]=sc.next();
        Arrays.sort(s,(a,b)-> new BigDecimal(b).compareTo(new BigDecimal(a)));
        for(String str:s) System.out.println(str);
    }
}