import java.util.*;
public class gettingbit{
    public static int getbits(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        int ith =sc.nextInt();
        System.out.print(getbits(num,ith));
    }
}