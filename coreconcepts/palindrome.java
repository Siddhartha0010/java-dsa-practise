import java.util.*;
public class palindrome{
    public static int palindrome(int n){
        int y = n;
        int temp =0;
        while(n>0){
            int r = n%10;
            temp = temp*10+r;
            n = n/10;
        }
        if(temp==y){
            return temp;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
          int num = 121;
          System.out.print(palindrome(num));
    }
}