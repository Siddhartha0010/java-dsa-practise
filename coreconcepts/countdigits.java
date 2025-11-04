import java.util.*;
public class countdigits{
    public static int count(int n){
        int count =0;
        while(n>0){
            n =n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
         int n = 12345;
         System.out.print(count(n));
    }
}