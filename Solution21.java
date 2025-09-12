import java.util.*;
class MyRegex {
    public static final String pattern=
        "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3})";
}
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String ip=sc.next();
            System.out.println(ip.matches(new MyRegex().pattern));
        }
    }
}