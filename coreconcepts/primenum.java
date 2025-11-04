import java.util.*;
public class primenum{
    public static void primenum(int num){
        int count=0;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num %i==0){
                count++;
            }
        }
        if(count !=0){
            System.out.print("composite");
        }
        else{
            System.out.print("prime");
        }
    }
    public static void main(String[] args){
        int n = 4;
        primenum(n);
    }
}