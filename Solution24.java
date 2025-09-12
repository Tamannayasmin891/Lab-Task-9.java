import java.util.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); sc.nextLine();
        String regex="<(.+)>([^<]+)</\\1>";
        Pattern p=Pattern.compile(regex);
        while(n-->0){
            String line=sc.nextLine();
            Matcher m=p.matcher(line);
            boolean found=false;
            while(m.find()){
                System.out.println(m.group(2));
                found=true;
            }
            if(!found) System.out.println("None");
        }
    }
}