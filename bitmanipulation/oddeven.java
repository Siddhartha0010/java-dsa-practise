import java.util.*;
public class oddeven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        if((n & x)==0){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    }
}