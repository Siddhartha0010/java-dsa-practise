// we need to make the last i elements in number 0
import java.util.*;
public class clear_last_i_bits{
    public static int clearbit(int num,int ith){
        int bitmask = (-1 << ith);    //-1 = 11111 all ones    or  ~0 = 11111 all ones      (so we are making a num = 1111 with i=2 as 1100 hence we removed last i bits)
        return (num & bitmask);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.print(clearbit(n,i));

    }
}