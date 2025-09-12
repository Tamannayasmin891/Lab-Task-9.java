import java.util.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); sc.nextLine();
        while(n-->0){
            String pat=sc.nextLine();
            try{
                Pattern.compile(pat);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
            }
        }
    }
}