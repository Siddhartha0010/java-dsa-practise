import java.util.*;
public class number_pyramid{
    public static void num(int n){
        for(int line =1;line<=n;line++){
            for(int num = 1;num<=line;num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num(n);
    }
}