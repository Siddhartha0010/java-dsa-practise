import java.util.*;
public class largest_smallest{
    public static void large(int num){
        int max = Integer.MIN_VALUE;
        while(num>0){
            int r = num%10;
            if(r>max){
                max = r;
            }
            num = num/10;
        }
        System.out.println(max);

    }
    public static void small(int num){
        int min = Integer.MAX_VALUE;
        while(num>0){
            int r = num%10;
            if(r<min){
                min = r;
            }
            num = num/10;

        }
        System.out.print(min);
    }
    public static void main(String[] args){
        int n = 9872;
        large(n);
        small(n);
    }
}