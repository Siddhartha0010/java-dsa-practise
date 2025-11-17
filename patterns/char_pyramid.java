import java.util.*;
public class char_pyramid{
    public static void charpy(int n){
        char ch = 'A';
        for(int line =0;line<n;line++){
             for(int j =0;j<=line;j++){
                System.out.print(ch);
                ch++;
             }
             System.out.println();
        }
    }
    public static void main(String[] args){
        int n =4;
        charpy(n);
    }
}