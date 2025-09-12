import java.util.*;
public class Solution {
    public static String getSmallestAndLargest(String s,int k){
        String smallest=s.substring(0,k), largest=smallest;
        for(int i=1;i+k<=s.length();i++){
            String sub=s.substring(i,i+k);
            if(sub.compareTo(smallest)<0) smallest=sub;
            if(sub.compareTo(largest)>0) largest=sub;
        }
        return smallest+"\n"+largest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next(); int k=sc.nextInt();
        System.out.println(getSmallestAndLargest(s,k));
    }
}