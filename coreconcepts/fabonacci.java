import java.util.*;
public class fabonacci {
    public static void fabfn(int n){
       int a=0;
       int b=1;
       if(n>=1){
       System.out.print(a+" ");
       }
       if(n>=2){
       System.out.print(a+" ");
       }
       for(int i=2;i<n;i++){
           int c = a+b;
           System.out.print(c+" ");
           a=b;
           b=c;
       }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fabfn(n);
    }
}
