import java.util.*;
public class reversenum{
    public static int revnum(int num){
        int temp =0;
        while(num>0){   //num =279
            int r= num%10;   //r =9
            temp =temp*10+ r;
            num = num/10;
        }
        return temp;
    }
    public static void main(String[] args){
         int n = 1234;
         System.out.print(revnum(n));
    }
}