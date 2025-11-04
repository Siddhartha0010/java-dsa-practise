import java.util.*;
public class Reversestring{
    public static String reverse(String s){
        char arr[] = s.toCharArray();
        int ch = 0;
        int  n = s.length()-1;
        char temp;
        while(ch<n){
             temp = arr[ch];
             arr[ch] = arr[n];
             arr[n] =temp;
             ch++;
             n--;
       }
       return new String(arr);
       
    }
    public static void main(String[] args){
        String str = "abcde";
        System.out.print(reverse(str));
        
    }
}