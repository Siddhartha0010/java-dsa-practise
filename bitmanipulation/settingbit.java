import java.util.*;
public class settingbit{
    public static int setbit(int num,int ith){
        int bitmask = 1 << ith;
        return (num | bitmask);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.print(setbit(n,i));

    }
}