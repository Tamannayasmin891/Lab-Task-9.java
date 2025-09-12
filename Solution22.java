import java.util.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); sc.nextLine();
        String regex="\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        while(n-->0){
            String line=sc.nextLine();
            Matcher m=p.matcher(line);
            while(m.find()){
                line=line.replaceAll(m.group(),m.group(1));
            }
            System.out.println(line);
        }
    }
}