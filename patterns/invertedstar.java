import java.util.*;
public class invertedstar{
    public static void inverted(int n){
        for(int line = n-1;line>=0;line--){
            for(int star = 0;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inverted(n);
    }
}