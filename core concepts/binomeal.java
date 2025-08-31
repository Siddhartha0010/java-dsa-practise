import java.util.*;
public class binomeal{
    public static int fun(int a){
        int sum = 1;
       for(int i=1;i<=a;i++){
              sum = sum*i;
       }
       return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int num = fun(n);
        int den = fun(r)*fun(n-r);
        int fin = num/den;
        System.out.println(fin);
    }
}