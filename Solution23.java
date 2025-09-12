import java.util.*;
public class Solution {
    private static final String pattern="^[A-Za-z]\\w{7,29}$";
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); sc.nextLine();
        while(n-->0){
            String user=sc.nextLine();
            System.out.println(user.matches(pattern)?"Valid":"Invalid");
        }
    }
}