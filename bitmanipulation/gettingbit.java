import java.util.*;
public class gettingbit{
    public static int getbits(int n,int i){
        int bitmask = 1<<i;   //here we are just creating a binary num where it will be having 1 at ith place
        if((n & bitmask) == 0){    // now we are performing &operation so that if the ith number in n is 0 will return 0 else if its 1 it returns 1.
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