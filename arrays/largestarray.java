import java.util.*;
public class largestarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a[] = new int[k];
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            a[i] = sc.nextInt();
        
        if(a[i]>largest){
            largest = a[i];
        }
        if(a[i]<smallest){
            smallest = a[i];
        }
        }
        System.out.println("Largest value: "+  largest);
        System.out.println("Smallest value: "+ smallest);
    }
}