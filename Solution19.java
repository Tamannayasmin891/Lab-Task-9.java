import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        if(s.isEmpty()){ System.out.println(0); return; }
        String[] tokens=s.split("[ !,?._'@]+");
        System.out.println(tokens.length);
        for(String t:tokens) System.out.println(t);
    }
}