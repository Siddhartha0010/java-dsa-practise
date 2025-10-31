// we need to make the ith element 0
import java.util.*;
public class clearbit{
    public static int clearbit(int num,int ith){
        int bitmask = ~(1 << ith);
        return (num & bitmask);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.print(clearbit(n,i));

    }
}