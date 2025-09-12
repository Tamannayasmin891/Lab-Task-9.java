import java.util.*;
import java.time.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mm=sc.nextInt(), dd=sc.nextInt(), yy=sc.nextInt();
        LocalDate d=LocalDate.of(yy,mm,dd);
        System.out.println(d.getDayOfWeek().toString());
    }
}