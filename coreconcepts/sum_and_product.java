import java.util.*;
public class sum_and_product{
    public static int sum(int n){
        int temp=0;
        while(n>0){ //123 
            int r = n%10;   //3   //2   //1
            temp = temp+r;  //3    //5   //6
            n = n/10;      //12    //1   //0
        }
        return temp;
    }

    public static int product(int n){
        int temp = 1;
        while(n>0){
            int r = n%10;  
            temp = temp*r;
            n = n/10;
        }
        return temp;
    }
    public static void main(String[] args){
        int num = 191;
        System.out.println("sum is"+sum(num)+"  "+"product is:"+ product(num));
    }
}