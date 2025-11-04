import java.util.*;
public class strongnum{
    public static void fact(int n){
        int p =n;
        int temp =0;
        while(n>0){
            int fact =1;
            int r = n%10;
            for(int i=1;i<=r;i++){
                fact = fact*i;
            }
            temp = temp+fact;
            n = n/10;
        }
      if(temp == p){
        System.out.print("yes: "+temp +" strong num");
      }
      else{
        System.out.print("no");
      }
    }
    public static void main(String[] args){
        int num = 145;
        fact(num);
    }
}