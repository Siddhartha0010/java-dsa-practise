import java.util.*;
public class armstrong{
    public static boolean arm(int n){
        int p = n;
        int temp =0;
        while(n>0){
            int r = n%10;
            temp = temp+(int)Math.pow(r,3);
            n = n/10;
        }
        return p == temp;
    }
    public static void main(String[] args){
        int n = 153;
        if(arm(n)){
            System.out.print("Yes its armstrong");
        }
        else{
            System.out.print("No its not");
        }

    }
}