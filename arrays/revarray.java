import java.util.*;
public class revarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        } 
        int start = 0;
        int end = a.length-1;
        for(start=0;start<end;start++){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            end--;
        }
        for(int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}