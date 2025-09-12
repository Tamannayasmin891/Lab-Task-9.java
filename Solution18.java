import java.util.*;
public class Solution {
    static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()) return false;
        char[] ca=a.toLowerCase().toCharArray();
        char[] cb=b.toLowerCase().toCharArray();
        Arrays.sort(ca); Arrays.sort(cb);
        return Arrays.equals(ca,cb);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next(), b=sc.next();
        System.out.println(isAnagram(a,b)?"Anagrams":"Not Anagrams");
    }
}