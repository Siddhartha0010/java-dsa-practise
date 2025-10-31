//we will make ith bit initially zero and then update its place with newbit
import java.util.*;
public class updateithbit{
    public static int updatebit(int num,int i,int newbit){
        int bitmask = ~(1 << i);   //making the ith bit zero and adding it with num in next step
        int clearnum = (num & bitmask);   //   now ith number is cleared to zero next we need to place our newbit in its place
        int newbitmask = (newbit<<i);
        return (clearnum | newbitmask);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int n1 = sc.nextInt();
        System.out.print(updatebit(n,i,n1));

    }
}